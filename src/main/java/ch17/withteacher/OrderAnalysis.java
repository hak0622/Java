package ch17.withteacher;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderAnalysis {
    public static void main(String[] args) {
        // 제품 목록 생성
        Product laptop = new Product("노트북", "전자제품", 1200000);
        Product phone = new Product("스마트폰", "전자제품", 800000);
        Product book = new Product("자바 책", "도서", 30000);
        Product headphone = new Product("헤드폰", "전자제품", 120000);
        Product tablet = new Product("태블릿", "전자제품", 500000);
        Product charger = new Product("충전기", "액세서리", 25000);

        // 주문 목록 생성
        List<Order> orders = Arrays.asList(
                new Order(1, "김철수", Arrays.asList(laptop, headphone), LocalDate.of(2023, 3, 15)),
                new Order(2, "이영희", Arrays.asList(phone, charger), LocalDate.of(2023, 4, 20)),
                new Order(3, "박민수", Arrays.asList(book, tablet), LocalDate.of(2023, 5, 10)),
                new Order(4, "최지원", Arrays.asList(laptop, phone, charger), LocalDate.of(2023, 5, 22)),
                new Order(5, "김철수", Arrays.asList(tablet, book), LocalDate.of(2023, 6, 5))
        );
        List<Integer>answer1 = orders.stream()
                .filter(order->order.getTotalAmount()>=1000000)
                .map(Order::getOrderId)
                .toList();
        System.out.println("answer1 :"+ answer1);

        Map<String,Double>answer2 = orders.stream()
                .collect(Collectors.groupingBy(
                        order -> order.getCustomerName(),
                        Collectors.summingDouble(order ->order.getTotalAmount())
                ));
        System.out.println("answer2: "+ answer2);

        String answer3 = orders.stream()
                .flatMap(order->order.getProducts().stream())
                .collect(Collectors.groupingBy(
                   product -> product.getCategory(),
                   Collectors.counting()
                ))
                .entrySet().stream()
                .max((e1,e2)->Long.compare(e1.getValue(),e2.getValue()))
                .map(entry-> entry.getKey())
                .orElse("없다");
        System.out.println("answer3: "+answer3);

        List<String> answer4 =
                orders.stream()
                        .filter(order
                                -> order.getOrderDate().isAfter(
                                LocalDate.of(2023, 4, 30)))
                        .flatMap(order -> order.getProducts().stream())
                        .map(product -> product.getName())
                        .distinct()
                        .toList();
        System.out.println("answer4 = " + answer4);

        Map<String, Double> answer5
                = orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.groupingBy(
                        product -> product.getCategory(), // K
                        Collectors.averagingDouble(product -> product.getPrice())
                ));
        System.out.println("answer5 = " + answer5);

        Map<LocalDate,Double>answer6 = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getOrderDate,
                        Collectors.summingDouble(Order::getTotalAmount)
                ));
        System.out.println("answer6 = "+answer6);
    }
}
