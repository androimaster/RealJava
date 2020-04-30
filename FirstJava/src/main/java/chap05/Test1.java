package chap05;

public class Test1 {
    public static void main(String[] args) {
        // 1학년은 1반부터 3반까지 있습니다. 1반은 12명, 2반 12명, 3반은 12명이 있습니다.
        // 2학년은 1반부터 3반까지 있습니다. 1반은 9명, 2반 12명, 3반은 10명이 있습니다.
        // 3학년은 1반부터 3반까지 있습니다. 1반은 7명, 2반 12명, 3반은 11명이 있습니다.

        int[][][] students = new int[3][3][12]; //제일 큰 배열로 할당한다.

        students[1][0] = new int[9]; //2학년 1반은 9명
        students[1][2] = new int[10]; //2학년 3반은 9명
        students[2][0] = new int[7]; //3학년 1반은 7명
        students[2][2] = new int[11]; //3학년 3반은 11명

        System.out.printf("1학년 1반 %d명\n", students[0][0].length);
        System.out.printf("1학년 2반 %d명\n", students[0][1].length);
        System.out.printf("1학년 3반 %d명\n", students[0][2].length);
        System.out.printf("2학년 1반 %d명\n", students[1][0].length);
        System.out.printf("2학년 2반 %d명\n", students[1][1].length);
        System.out.printf("2학년 3반 %d명\n", students[1][2].length);
        System.out.printf("3학년 1반 %d명\n", students[2][0].length);
        System.out.printf("3학년 2반 %d명\n", students[2][1].length);
        System.out.printf("3학년 3반 %d명\n", students[2][2].length);
    }
}
