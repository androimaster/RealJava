package chap17;

import java.util.stream.Stream;

public class Test5 {

    public static void main(String[] args) {
        Stream.generate(Math::random)
              .map(n -> (n * 44) + 1)  //0부터 시작하기 때문에 1을 더한다
              .map(Math::round)
              .distinct()
              .limit(6)
              .sorted()
              .forEach(x -> System.out.printf("%d ", x));
    }

}
