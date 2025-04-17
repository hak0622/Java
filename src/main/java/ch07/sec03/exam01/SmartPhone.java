package ch07.sec03.exam01;

import ch07.sec03.exam02.Phone;

public class SmartPhone extends Phone {
    public SmartPhone(String model,String color){
        super(model,color);
        System.out.println("SmartPhone(String model, String color)생성자 실행됨");
    }
}
