package ch14.sec03.exam;

public class ThreadExample {
    public static void main(String[] args) {
        Thread movieThread = new Thread() {
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("동영상을 재생합니다.");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable musicRunnable = new Runnable() {
            public void run() {
                for (int i = 0; i < 6; i++) {
                    System.out.println("음악을 재생합니다.");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread musicThread = new Thread(musicRunnable);

        movieThread.start();
        musicThread.start();
    }
}
