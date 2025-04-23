package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data){
        try{
            int result = data.length();
            System.out.println("문자 수 : " + result);
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }finally {
            System.out.println("[마무리 실행]");
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("Thisisjava");
        printLength(null); // 어떠한 값에 null 을 넣고 실행하면 nullpointerException이 나오는걸로 알고있다.
        System.out.println("[프로그램 종료]");
    }
}
