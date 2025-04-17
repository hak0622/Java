package ch07.sec12;

public class Dog extends Animal{
    public Dog(){
        super.name = "초코";
    }
    public void sound(){
        System.out.println(super.name+"왈");
    }
}
