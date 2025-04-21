package ch08.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelelvision();
        rc.turnOn();
        rc.turnOff();

        Searchable searchable = new SmartTelelvision();
        searchable.search("https://www.naver.com");
    }
}
