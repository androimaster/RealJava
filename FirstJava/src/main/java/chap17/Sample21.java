package chap17;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample21 {
    public static void main (String[] args) {
        List<String> G7 = Stream.of("미국", "영국", "프랑스", "독일", "이탈리아", "캐나다", "일본")
                                .collect(Collectors.collectingAndThen(Collectors.toList(),
                                                                      Collections::unmodifiableList));
        System.out.println(G7);
        G7.add("대한민국");
    }
}
