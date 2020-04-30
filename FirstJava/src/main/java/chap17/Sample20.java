package chap17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sample20 {
    public static void main (String[] args) {
        List<String> locals = Arrays.asList("서울", "대전", "대구", "광주", "부산", "제주");
        List<String> reversedLocals = locals.stream()
                                          .collect(Collectors.collectingAndThen(Collectors.toList(),
                                                   city -> {
                                                       Collections.reverse(city);
                                                       return city.stream();
                                                   }))
                                          .collect(Collectors.toList());
        System.out.println(locals.toString());
        System.out.println(reversedLocals.toString());
    }
}
