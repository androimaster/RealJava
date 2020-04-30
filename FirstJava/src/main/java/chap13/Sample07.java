package chap13;

import java.text.DecimalFormat;

public class Sample07 {

    public static void main(String[] args) {
        double myMoney   = 5000000; //원금
        double lossMoney = 3000000; //손실
        double amount    = lossMoney/myMoney;

        DecimalFormat df1 = new DecimalFormat("##,###,##0");
        DecimalFormat df2 = new DecimalFormat("##0%");
        System.out.println("원금   : " + df1.format(myMoney));
        System.out.println("손실   : " + df1.format(lossMoney));
        System.out.println("손실률 : " + df2.format(amount));
    }

}
