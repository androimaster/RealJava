package chap11;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Test4 {

    public static void main(String[] args) {

        int times = 0; //로또 예상 번호 수

        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 예상 번호를 출력하시겠습니까? ");
        times = sc.nextInt();
        Random random = new Random();	
        for (int i = 0; i < times; i++){
            var list = new TreeSet<Integer>();
            for (int j = 0; j < 7; j++ ){
                //로또 번호 입력
                int number = random.nextInt(45) + 1;
                //이미 값이 있는지 확인한다.
                if(!list.contains(number)) {
                    if(j == 6) {
                        //로또 번호와 보너스 번호 출력
                        for(int no : list) {
                            System.out.printf("%d. ", no);
                        }
                        System.out.println("+ 보너스 " + number);
                    }
                    else {
                        //로또 번호 6개가 모두 모일때까지 Set에 추가
                        list.add(number);
                    }
                }
                else {
                    j--; //이미 값이 존재하여 반복문을 다시 돌린다
                }
            }
        }
    }
}
