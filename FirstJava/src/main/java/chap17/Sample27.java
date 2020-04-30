package chap17;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sample27 {

    public static void main(String[] args) {
        long sum1 = IntStream.rangeClosed(2, 10)
                             .reduce(1, Integer::sum);
        System.out.println(sum1);

        IntStream range = IntStream.rangeClosed(2, 10);
        long sum2 = range.boxed().collect(Collectors.reducing(1, Integer::sum));
        System.out.println(sum2);
    }

}
