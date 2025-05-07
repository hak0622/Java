package ch16.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 익명 클래스 방법
        person.action(new Workable() {
            @Override
            public void work() {
                System.out.println("출근을 합니다.");
                System.out.println("프로그래밍 합니다.");
            }
        });

        //람다식
        person.action(()->{
            System.out.println("퇴사하고싶다");
        });
    }
}
