package chap05;

public class Sample05 {
    public static void main(String[] args) {
        int[][] household = new int[5][3]; //5층 각 3개 세대를 배열로 할당합니다.  (5 x 3)

        household[1] = new int[1];         //2층은 1개 세대로 다시 1개의 배열 공간을 재할당합니다.

        System.out.printf("1층 %d세대\n" , household[0].length);
        System.out.printf("2층 %d세대\n" , household[1].length);
        System.out.printf("3층 %d세대\n" , household[2].length);
        System.out.printf("4층 %d세대\n" , household[3].length);
        System.out.printf("5층 %d세대\n" , household[4].length);
    }
}
