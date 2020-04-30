package chap08;

public class Sample05 {

    public static int total = 0;
    public static void main(String[] args) {

        System.out.printf("결과 : %d%n", sum(1, 2, 3));
        System.out.printf("결과 : %d", sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    }

    public static int sum(int... a) {
        for(int i : a) {
            total += i;
        }
        return total;
    }
}
