package chap17;

import java.util.stream.Stream;

public class Sample50 {

    public static void main(String[] args) {
        Stream.of("mouse", "cow", "horse", "monkey")
              .peek(x -> System.out.println("처리할 요소 : " + x))
              .map(String::toUpperCase)
              .peek(x -> System.out.println("처리된 요소 : " + x))
              .forEach(System.out::println);
    }

}
