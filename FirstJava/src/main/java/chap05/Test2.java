package chap05;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[][] box = new int[5][5];

        box[0][4] = 6;

        box[1][3] = 5;
        box[1][4] = 6;

        box[2][2] = 4;
        box[2][3] = 5;
        box[2][4] = 6;

        box[3][1] = 3;
        box[3][2] = 4;
        box[3][3] = 5;
        box[3][4] = 6;

        box[4][0] = 2;
        box[4][1] = 3;
        box[4][2] = 4;
        box[4][3] = 5;
        box[4][4] = 6;

        System.out.println(Arrays.toString(box[0]));
        System.out.println(Arrays.toString(box[1]));
        System.out.println(Arrays.toString(box[2]));
        System.out.println(Arrays.toString(box[3]));
        System.out.println(Arrays.toString(box[4]));
    }
}
