package ch05.sec06;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[]scores = {83,90,87};
        int sum1 = 0;
        for(int i=0; i<3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);
        //배열을 매개값으로 주고, printItem() 메소드 호출
        printItem( new int[] { 83, 90, 87 } );
    }
    public static void printItem( int[] scores ) {
        //매개변수가참조하는배열의항목을출력
        for(int i=0; i<3; i++) {
            System.out.println("score[" + i+ "]: " + scores[i]);
        }
    }
}
