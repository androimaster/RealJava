package chap07;

public class Sample02 {

    public static void main(String[] args) {

        int a = 3;
        if(a < 10 || a % 2 == 0) {
            System.out.println("10보다 작은 수이며 짝수입니다.");
        }

        if(a < 5 && a % 2 == 1) {
            System.out.println("5보다 작은 수이며 홀수입니다.");
        }

    }
}