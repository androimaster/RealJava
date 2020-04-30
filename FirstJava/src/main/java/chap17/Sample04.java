package chap17;

import java.util.Arrays;
import java.util.stream.Stream;

public class Sample04 {

    public static void main(String[] args) {
        String[] str1 = {"빵형", "상도", "타노스"};
        String[] str2 = {"인호", "학건"};

        Stream<String[]> strm1 = Stream.of(str1, str2);

        System.out.println("** Stream.of(str1, str2)");
        Stream.of(str1, str2).forEach(x -> System.out.println(Arrays.deepToString(x)));

        System.out.println("\n** strm1.flatMap(Arrays::stream)");
        Stream<String> strm2 = strm1.flatMap(Arrays::stream);
        strm2.forEach(System.out::println);
    }

}
