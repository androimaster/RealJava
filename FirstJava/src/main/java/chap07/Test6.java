package chap07;

import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {
        int goal   = (int)(Math.random() * 5 + 1);  //컴퓨터가 생각하는 수
        Scanner sc = new Scanner(System.in);
        int cnt = 0;                                //입력한 횟수
        int target = 0;                             //입력한 값
        boolean loopFlag = true;                    //반복여부
        do {
            cnt++;
            System.out.print("컴퓨터가 생각하는 수를 입력하세요 : ");
            target = sc.nextInt();
            if(target == goal) loopFlag = false;
        }
        while(loopFlag);

        System.out.printf("축하합니다. %d번만에 맞췄습니다.", cnt);
    }

}
