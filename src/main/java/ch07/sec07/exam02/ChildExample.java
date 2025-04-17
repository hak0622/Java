package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;
        parent.method1();
        parent.method2();
        //parent.method3(); parent에는 method3이 없으니 사용 못한다
    }
}
