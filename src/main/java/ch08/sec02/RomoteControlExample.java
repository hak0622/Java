package ch08.sec02;

public class RomoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn();
        rc = new Audio();
        rc.turnOn();
    }
}
