package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample47 {

    public static void main(String[] args) {
        //Sample23.Student 객체를 활용합니다.
        List<Score> scores = Arrays.asList(
            new Score("빵형", 61, 31, 31),
            new Score("타노스", 62, 62, 82),
            new Score("상도", 94, 44, 41)
        );
        
        System.out.println("이름 순으로 순정렬");
        List<Score> list1 = scores.stream()
                                  .sorted((x, y) -> x.getName().compareTo(y.getName()))
                                  .collect(Collectors.toList());
        System.out.println(list1.toString());
        
        System.out.println("영어 성적순으로 역정렬");
        List<Score> list2 = scores.stream()
                                  .sorted((x, y) -> y.getEng() - x.getEng())
                                  .collect(Collectors.toList());
        System.out.println(list2.toString());
    }

}
