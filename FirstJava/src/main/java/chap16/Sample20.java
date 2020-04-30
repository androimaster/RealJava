package chap16;

import java.util.function.Predicate;

public class Sample20 {

    public static void main(String[] args) {
        //3의 배수이거나 홀수인 수를 출력하세요
        int[] no = {1, 3, 6, 8};

        Predicate<Integer> isOdd  = (s) -> (s % 2) == 1; //홀수인가
        Predicate<Integer> isMulitpleThree  = (s) -> (s % 3) == 0; //3의 배수인가
        
        for(int num : no) {
            if(isOdd.or(isMulitpleThree).test(num)) {
                System.out.printf("%d는 홀수이거나 3의 배수입니다.\n", num);
            }
        }
    }

}
