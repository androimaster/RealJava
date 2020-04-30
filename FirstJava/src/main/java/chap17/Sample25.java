package chap17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sample25 {

    public static void main(String[] args) {
        List<Score> scores = Arrays.asList(
            new Score("빵형", 61, 71, 81),
            new Score("타노스", 62, 72, 82),
            new Score("상도", 100, 100, 61)
        );

        System.out.println("** 국어가 최저 점수인 학생");
        scores.stream()
              .collect(Collectors.minBy(Comparator.comparing(Score::getKor)))
              .ifPresent(System.out::println);

        System.out.println("** 영어가  최고 점수인 학생");
        scores.stream()
              .collect(Collectors.maxBy(Comparator.comparing(Score::getKor)))
              .ifPresent(System.out::println);
        
        System.out.println("**이름순으로 제일 빠른 학생");
        scores.stream()
              .collect(Collectors.minBy(Comparator.comparing(Score::getName)))
              .ifPresent(System.out::println);
        
        System.out.println("**이름순으로 제일 느린 학생");
        scores.stream()
              .collect(Collectors.maxBy(Comparator.comparing(Score::getName)))
              .ifPresent(System.out::println);
    }

}
