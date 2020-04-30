package chap08;

public class Sample04 {

    public static int total = 0;
    public static void main(String[] args) {

        System.out.printf("결과 : %d", sum(1, 2, 3));

    }

    public static int sum(int a) {
        total += a;
        return total;
    }

    public static int sum(int a, int b) {
        total += (a + b);
        return total;
    }

    public static int sum(int a, int b, int c) {
        total += (a + b + c);
        return total;
    }
}
