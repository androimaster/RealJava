package chap13;

import java.text.DecimalFormat;

public class Sample04 {
    public static void main(String[] args) {
        float myMoney = -5000f;
        System.out.println(myMoney);
        DecimalFormat df = new DecimalFormat("##,###,###.00");
        System.out.println(df.format(myMoney));
    }
}
