package ch06;

public class Database {
    private static Database instance = new Database();
    private String connection = "MYSQL";
    public String connect(){
        System.out.println(connection+"에 연결합니다.");
        return connection;
    }
    public void close(){
        System.out.println(connection+"을 닫습니다.");
    }
    public static Database getInstance(){
        return instance;
    }
}
