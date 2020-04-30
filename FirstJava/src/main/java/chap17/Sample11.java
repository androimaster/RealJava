package chap17;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sample11 {

    public static void main(String[] args) {
        int[] numbers = IntStream.rangeClosed(1, 100).toArray();  // Stream을 활용하여 1부터 100까지의 배열 생성
        Arrays.stream(numbers).forEach(System.out::println);      // Stream을 활용하여 배열 출력
    }

}
