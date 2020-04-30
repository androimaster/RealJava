package chap05;

import java.util.Arrays;

public class Sample09 {
    public static void main(String[] args) {
        int[][][] household = {
            {{1, 2, 3}, {4, 5, 6}, {7},{8, 9, 10},{11, 12, 13}},
            {{14, 15, 16}, {17, 18, 19}, {20},{21, 22, 23},{24, 25, 26}}
        };
		
        System.out.println(Arrays.deepToString(household));
    }
}

