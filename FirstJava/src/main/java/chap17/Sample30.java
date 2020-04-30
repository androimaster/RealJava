package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample30 {

    public static void main(String[] args) {
        //Sample23.Student 객체를 활용합니다.
        List<Score> scores = Arrays.asList(
            new Score("빵형", 61, 71, 81),
            new Score("타노스", 62, 72, 82),
            new Score("상도", 100, 100, 61)
        );
        
        // 수학 80점 이상인 사람과 그렇지 않는 사람을 구분하세요
        Map<Boolean, List<Score>> result = scores.stream()
                                                 .collect(Collectors.partitioningBy( s -> {
                                                      return (s.getMat() > 80) ? true : false; 
                                                  }));

        System.out.println("** 수학 80점 이상인 고득점자");
        List<Score> list = result.get(true);
        for(Score score : list) {
            System.out.println(score.getName());
        }
        
        // 수학 80점 이상인 사람과 그렇지 않는 사람은 각각 몇명인가요?
        Map<Boolean, Long> count = scores.stream()
                                         .collect(Collectors.partitioningBy( s -> {
                                             return (s.getMat() > 80) ? true : false; 
                                         }, Collectors.counting()));

        System.out.printf("80점 이상인 사람은 %d명 입니다.\n", count.get(true));
    }

}