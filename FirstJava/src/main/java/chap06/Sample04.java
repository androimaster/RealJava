package chap06;

public class Sample04 {
    public static void main(String[] args) {
        //1단부터 9단까지	
        for(int i = 1; i < 10; i++) {     // i는 1부터 10보다 작은 정수
            //1부터 9까지 곱할 수
            for(int j = 1; j <= 9; j++) { //j는 1부터 9보다 작거나 같은 정수
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
            System.out.println();//단이 끝날 때마다 개행 처리
        }
    }
}
