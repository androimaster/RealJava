package chap07;

import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("입력값 : ");
        int left = 0;
        int right = 0;
        String str = in.nextLine().toUpperCase();
        for(char c : str.toCharArray()) {
            switch(c) {
                case 'A', 'B', 'C', 'D', 'E', 'F'
                   , 'G', 'Q', 'R', 'S', 'T', 'V'
                   , 'W', 'X', 'Z', '1', '2', '3'
                   , '4', '5' -> left++;
                case 'H', 'I', 'J', 'K', 'L', 'M'
                   , 'N', 'O', 'P', 'U', 'Y', '6'
                   , '7', '8', '9', '0' -> right++;
            }
        }
        System.out.printf("왼손 : %d\t오른손 : %d\n", left, right);
    }

}