package chap17;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample51 {

    public static void main(String[] args) {
        //선착순 3명
        Stream.of("빵형", "상도", "타노스", "학건", "인호")
                .limit(3)
                .forEach(System.out::println);

        //총 7경기 중에 앞 2경기는 연습경기
        Map<String, Long> info = Stream.of("패", "승", "패", "승", "승", "승", "패")
                                       .skip(2) //앞에 2 경기는 연습경기
                                       .collect(Collectors.groupingBy( Function.identity()
                                              , Collectors.counting()));
        System.out.println(info);
    }
    
}