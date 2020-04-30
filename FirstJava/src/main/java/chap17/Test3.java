package chap17;

import java.util.stream.IntStream;

public class Test3 {

    public static void main(String[] args) {
        //1에서 100까지의 수중에서 소수만을 골라서 총 몇 개의 요소가 있는지 Stream을 이용하여 구현하세요.
        IntStream.rangeClosed(2, 100)
                 .filter(x -> {
                      int i = 
                      IntStream.rangeClosed(2, x)
                               .map(y -> (x % y == 0) ? 1:0)
                               .reduce(0, Integer::sum);
                      return i < 2; 
                  })
                 .forEach(System.out::println);
    }

}
