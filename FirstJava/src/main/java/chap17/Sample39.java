package chap17;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.IntStream;

public class Sample39 {

    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 10)
                                      .map(x -> x * 2)
                                      .boxed()
                                      .collect(toList());
        System.out.println(list);
    }

}
