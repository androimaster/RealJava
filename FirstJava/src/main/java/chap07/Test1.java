package chap07;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = in.nextInt();
        if(num > 0) {
            System.out.printf("%d는 양수입니다.", num);
        }
        else {
            System.out.printf("%d는 음수입니다.", num);
        }
    }

}
