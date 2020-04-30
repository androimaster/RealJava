package chap17;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sample42 {

    public static void main(String[] args) {
        Map<Boolean, List<Long>> m1 = 
            IntStream.range(1, 10)
                     .mapToLong(x -> x)
                     .boxed()
                     .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(m1);
        
        Map<Boolean, List<Long>> m2 = 
            IntStream.range(1, 10)
                     .mapToObj(Long::new)
                     .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(m2);
    }

}
