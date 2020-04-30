package chap08;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("100이하의 정수를 입력해주세요 : ");
            int in = sc.nextInt();

            if(in > 100) {
                System.out.println("큰 값을 입력했습니다.");
            }
            else if(in == 0) {
                System.out.println("종료합니다.");
                break;
            }
            else {
                System.out.println(sum(in));
            }
        } while(true);
    }

    public static int sum(int in) {
        int ret;
        if(in > 0) {
            ret = in + sum((in-1));
        }
        else {
            ret = 0;
        }
        return ret;
    }
}
