package chap17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sample34 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,4,7,56,43, 99);
        Integer minNumber = list.stream().min(Integer::compare).get();
        System.out.println("최솟값 :: " + minNumber);
        
        //Sample23.Student 객체를 활용합니다.
        List<Score> scores = Arrays.asList(
            new Score("빵형", 61, 71, 81),
            new Score("타노스", 62, 72, 82),
            new Score("상도", 100, 100, 61)
        );
        
        scores.stream()
              .collect(Collectors.minBy(Comparator.comparing(Score::getMat)))
              .ifPresent(System.out::println);

        scores.stream()
              .min(Comparator.comparing(Score::getMat))
              .ifPresent(System.out::println);
        
        Score maxMathScore = scores.stream()
                                   .max(Comparator.comparing(Score::getMat))
                                   .get();
        System.out.println("최고 수학점수인 사람 :: " + maxMathScore);
    }

}
