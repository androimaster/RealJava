package chap17;

import java.util.stream.IntStream;

public class Sample32 {

    public static void main(String[] args) {
        System.out.println(
            IntStream.rangeClosed(11, 33)
                     .count()
        );
    }

}
