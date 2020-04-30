package chap16;

import java.text.DecimalFormat;
import java.util.function.Function;

public class Sample12 {

    public static void main(String[] args) {
        int myMoney = 100000;
        
        //10% 세금을 납부합니다.
        Function<Integer,Integer> work = (money) -> {
            System.out.printf("* [%d] 세금을 납부합니다.\n", (int)(money * 0.1)  );
            return money = (int) (money * 0.9);
        };
        
        //수입금을 더합니다.
        Function<Integer, Integer> before = (income) -> {
        	System.out.printf("* [%d] 수입이 발생했습니다.\n", income);
        	return income;
        };
        myMoney = work.apply(myMoney);
        printInfo(myMoney);
        myMoney += work.compose(before).apply(30000);
        printInfo(myMoney);
    }
    
    public static void printInfo(int myMoney) {
        DecimalFormat df = new DecimalFormat("##,###,###");
        System.out.println("잔액 : " + df.format(myMoney));
    }
}
