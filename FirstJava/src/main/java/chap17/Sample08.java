package chap17;

import java.util.stream.IntStream;

public class Sample08 {

    public static void main(String[] args) {
        //for(int i = 12; i <=18; i++) System.out.println(i);
        IntStream.rangeClosed(12, 18).forEach(System.out::println);
    }

}
