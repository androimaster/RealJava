package chap08.Sample21;

import chap08.Sample21.service.PrintServiceImpl;

public class Sample21 {

    public static PrintServiceImpl print = new PrintServiceImpl();

    public static void main(String[] args) {
        //출력한다.
        print.pringMessage();
    }

}
