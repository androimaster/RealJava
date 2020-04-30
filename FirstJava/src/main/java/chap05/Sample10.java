package chap05;

import java.util.Arrays;

public class Sample10 {
    public static void main(String[] args) {

        int[] num1 = {1, 2, 3};
        
        int[][] num2 = {
        	{1, 2, 3}, {4, 5, 6}, {7},{8, 9, 10},{11, 12, 13}
        };

        System.out.println(num1 + " - 배열 자체는 내용을 확인 할 수 없다.");
        System.out.println(Arrays.toString(num1) + " - Arrays.toString()"); //1차원 배열
        System.out.println(Arrays.toString(num2) + " - 다차원 배열을 출력할 수 없다"); //2차원 배열
        System.out.println(Arrays.deepToString(num2)); //다차원 배열의 출력
    }
}
