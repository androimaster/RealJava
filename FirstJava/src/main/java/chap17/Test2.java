package chap17;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        List<Integer> goods = Arrays.asList(
                20000, 5000, 10000, 200000, 100000,
                50000, 10000, 2000, 3500, 50000);
        int myMoney = 500000;
        myMoney = goods.stream().reduce(myMoney, (a, b) -> a - b);
        DecimalFormat df = new DecimalFormat("#,##0");
        System.out.println("남은 돈   : " + df.format(myMoney));
    }
}
