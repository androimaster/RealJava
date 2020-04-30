package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Sample13 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        
        System.out.println("* 직렬 스트림 forEach( )로 출력");
        IntStream.rangeClosed(65, 69).forEach(x -> System.out.println((char)x));

        System.out.println("\n* 병렬 스트림 forEach( )로 출력");
        IntStream.rangeClosed(65, 69).parallel()
                 .forEach(x -> System.out.println((char)x));

        System.out.println("\n* 병렬 스트림 forEachOrdered( )로 출력");
        IntStream.rangeClosed(65, 69).parallel()
                 .forEachOrdered(x -> System.out.println((char)x));
    }

}
