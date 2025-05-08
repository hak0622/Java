package ch17.withteacher;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DelayOperation {
    public static void main(String[] args) throws InterruptedException{
        //지연 연산 -> 최종 연산이 수행되기 전까지 중간 연산은 실행되지 않음
        List<String>names = Arrays.asList("일일일","이이","삼삼삼","사");

        //filter,map은 중간 연산
        Stream<String>stream = names.stream()
                .filter(name->{
                    System.out.println("filter:" + name);
                    return name.length() > 2;
                })
                .map(name->{
                    System.out.println("map: "+name);
                    return name.toUpperCase();
                });
        Thread.sleep(3000);

        List<String>result=stream.collect(Collectors.toList());
    }
}
