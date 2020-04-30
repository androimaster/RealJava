package chap17;

import java.util.stream.IntStream;

public class Sample36 {

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                 .average()
                 .ifPresent(System.out::println);

        double avg = IntStream.rangeClosed(1, 100)
                               .average()
                               .getAsDouble();
        System.out.println(avg);
    }

}
