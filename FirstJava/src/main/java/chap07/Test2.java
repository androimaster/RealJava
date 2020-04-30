package chap07;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        while(sc.hasNextInt()) {
            int you = sc.nextInt();
            if(you == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            
            int com = random.nextInt(3) + 1; //1~3까지 출력
            
            System.out.printf("컴퓨터 : %d\n", com);
            String result = (you - com) == 0 ? "비김" : (you - com) == -1 ? "패" : "승";
            System.out.printf("결과 : %s\n", result);
            System.out.print("숫자를 입력하세요 : ");
        }
    }
}
