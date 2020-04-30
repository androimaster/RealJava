package chap17;

import java.util.stream.Stream;

public class Sample52 {

    public static void main(String[] args) {
        Stream.generate(Math::random)
              .map(n -> (n * 9) + 1)
              .map(Math::round)
              .limit(10)
              .sorted()
              .forEach(System.out::println);
    }

}