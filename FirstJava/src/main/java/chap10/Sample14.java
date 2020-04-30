package chap10;

public class Sample14 {

    public static void main(String[] args) {
        //내지갑
        Wallet myWallet = new Wallet();

        //Pocket money
        Money<Integer> m1 = new Money<>();
        m1.getMoney(10000);

        //Part time job
        Money<Integer> m2 = new Money<>();
        m1.getMoney(600000);

        myWallet.insertMoney(m1);  //용돈을 넣는다
        myWallet.insertMoney(m2);  //알바비를 넣는다

        //지값을 확인한다
        System.out.println(myWallet.checkWalletMoney());
    }

}

class Wallet {
    double totalMoney = 0;

    public void insertMoney(Money<?> myMoney) {
        totalMoney += myMoney.getMyMoney();
    }

    public double checkWalletMoney() {
        return totalMoney;
    }
}

class Money<E extends Number> {
    double myMoney;

    public void getMoney(E info) {
        this.myMoney += info.doubleValue();
    }

    public double getMyMoney() {
        return myMoney;
    }
}
