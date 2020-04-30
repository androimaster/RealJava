package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample28 {
    public static void main(String[] args) {
        //Sample23.Student 객체를 활용합니다.
        List<Score> scores = Arrays.asList(
            new Score("빵형", 61, 71, 81),
            new Score("타노스", 62, 72, 82),
            new Score("상도", 100, 100, 61)
        );
        
        // 수학 점수를 기준으로 A, B, C, D, F 학점으로 분류하겠습니다.
        Map<String, List<Score>> result = scores.stream()
                                                .collect(Collectors.groupingBy( s -> {
                                                     return (s.getMat() > 90) ? "A" : 
                                                            (s.getMat() > 80) ? "B" : 
                                                            (s.getMat() > 70) ? "C" :  
                                                            (s.getMat() > 60) ? "D" : "F"; 
                                                }));
        
        result.keySet().forEach(key -> {
            System.out.printf("** 수학 %s 학점\n", key);
            List<Score> score = result.get(key);
            score.stream().forEach(s -> System.out.println(s.getName()));
        });
        
    }
}