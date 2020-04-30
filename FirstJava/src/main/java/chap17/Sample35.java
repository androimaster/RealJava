package chap17;

import java.util.stream.IntStream;

public class Sample35 {

    public static void main(String[] args) {
        int sum1 = IntStream.rangeClosed(1,100)
                            .boxed()
                            .reduce(0, (a, b) -> a + b);
        System.out.println(sum1);
        
        int sum2 = IntStream.rangeClosed(1, 100)
                            .boxed()
                            .reduce(0, Integer::sum);
        System.out.println(sum2);
                            
        Integer sum3 = IntStream.rangeClosed(1, 100)
                                .skip(10)
                                .sum();
        System.out.println(sum3);
    }
}
