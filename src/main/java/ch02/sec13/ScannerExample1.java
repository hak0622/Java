package ch02.sec13;

import java.util.Scanner;

public class ScannerExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X 값 입력 : ");
        int x = sc.nextInt();
        System.out.print("Y 값 입력 : ");
        int y = sc.nextInt();
        int result = x+y;
        System.out.println("X+Y: "+result);

    }
}
