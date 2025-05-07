package ch16.withteacher;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //익명 클래스
        Consumer<String>printString = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("s = " + s);
            }
        };
        printString.accept("집 보내줘");

        //람다식 변경
        Consumer<String>printString2 = (String s2)->{
            System.out.println("s2 = "+s2);
        };
        printString2.accept("람다식 변경");

        //BiConsumer<T,U> : 매개변수 T,U 2개
        BiConsumer<String,Integer> printNameAge = (String s,Integer age)->{
            System.out.println("s="+s+",age="+age);
        };
        printNameAge.accept("아무개",23);
    }
}
