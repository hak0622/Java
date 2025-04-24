package ch14.sec03.exam;

public class MusicRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable(){
           public void run(){
               for(int i=0; i<6; i++){
                   System.out.println("음악을 재생합니다.");
                   try{
                       Thread.sleep(500);
                   }catch (Exception e){
                       e.printStackTrace();
                   }
               }
           }
        });
        thread.start();
    }
}
