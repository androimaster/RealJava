package chap17;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Sample31 {

    public static void main(String[] args) {
        String[] animals = {"토끼", "호랑이", "고양이", "강아지", "고양이", "고양이"};
        System.out.println("** 기본 배열 출력");
        System.out.println(Arrays.deepToString(animals));

        System.out.println("\n** List로 변환 후 출력(중복이 발견됨)");
        List<String> ani1 = Arrays.stream(animals)
                                  .collect(toList());
        System.out.println(ani1.toString());

        System.out.println("\n** Set으로 변환 후 출력(중복 제거) 후 List로 반환");
        Set<String>  ani2 = ani1.stream()
                                .collect(toSet());

        //List로 반환
        List<String> ani3 = ani2.stream().collect(toList());
        System.out.println(ani3.toString());

        System.out.println("\n** distinct( )로 중복 제거 후 List로 반환");
        List<String> ani4 = Arrays.stream(animals)
                                  .distinct()
                                  .collect(toList());
        System.out.println(ani4.toString());
    }

}
