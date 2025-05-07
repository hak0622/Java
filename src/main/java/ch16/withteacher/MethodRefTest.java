package ch16.withteacher;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefTest {
    public static void main(String[] args) {
        // 익명 클래스
        Function<Integer,Integer> abs1 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return Math.abs(integer);
            }
        };
        System.out.println("abs1.apply(-10) = "+abs1.apply(-10));

        // 람다식 변경
        Function<Integer,Integer> abs2 = (Integer integer)-> Math.abs(-10);
        System.out.println("abs2.apply(-10) = "+abs2.apply(-10));

        //정적 메서드 참조로 변경
        //int Math.abs(integer) : 정수를 1개 전달 받아 정수 1개 (절대값) 반환
        Function<Integer,Integer> abs3 = Math::abs;
        System.out.println("abs3.apply(-10) = "+abs3.apply(-10));

        //인스턴스 메서드 참조 -> 문자열 소문자로 변경하기
        String str = "Hello world";
        // 익명 클래스
        Supplier<String>lower1 = new Supplier<String>() {
            @Override
            public String get() {
                return str.toLowerCase();
            }
        };
        // 람다식 변경
        Supplier<String>lower2 = ()->{return str.toLowerCase();};
        //인스턴스 메소드 참조
        Supplier<String>lower3 = str::toLowerCase;

        System.out.println("lower1.get() = " + lower1.get());
        System.out.println("lower2.get() = " + lower2.get());
        System.out.println("lower3.get() = " + lower3.get());

        //특정 타입의 인스턴스 메서드 참조
        // 람다식 : (String s) -> s.length();
        Function<String,Integer> strLength = String::length;
        System.out.println("strLength : "+strLength.apply(str));

        //List 순차 접근 후 출력
        List<String>nameList = new ArrayList<>();
        nameList.add("jond");
        nameList.add("asd");
        nameList.add("sfasg");
        nameList.add("qwer");

        //nameList 요소를 하나씩 꺼내 item에 저장 -> 출력
        nameList.forEach(item -> System.out.println(item));
        System.out.println("-----------------------");
        nameList.forEach(System.out::println);

        //BinaryOperator<T>
        BinaryOperator<Integer>operator1 = (a,b)-> a+b;
        System.out.println("sum1 : "+sumTwoNumbers(operator1,10,20));
        System.out.println("sum2 : "+sumTwoNumbers((a,b) -> a+b,10,20));
        System.out.println("sum3 : "+sumTwoNumbers(MethodRefTest::sum,10,20));
        System.out.println("sum4 : "+sumTwoNumbers(Integer::sum,10,20));
    }
    public static int sumTwoNumbers(BinaryOperator<Integer>op, int a, int b){
        return op.apply(a,b);
    }
    public static int sum(int num1,int num2){
        return num1 + num2;
    }
}
