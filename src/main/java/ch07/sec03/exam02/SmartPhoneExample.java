package ch07.sec03.exam02;

import ch07.sec03.exam01.SmartPhone;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시","은색");
        System.out.println("모델:"+myPhone.model);
        System.out.println("모델:"+myPhone.color);
    }
}
