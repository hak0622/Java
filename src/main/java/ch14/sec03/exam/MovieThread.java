package ch14.sec03.exam;

public class MovieThread {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            public void run(){
                for(int i=0; i<3; i++){
                    System.out.println("동영상을 재생합니다.");
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
    }
}
