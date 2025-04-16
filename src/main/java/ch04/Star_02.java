package ch04;

public class Star_02 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==========================");

        for (int i = 5; i >= 1; i--) { // i는 줄 수, 점점 줄어듦
            for (int j = 1; j <= i; j++) { // i만큼 별 출력
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
