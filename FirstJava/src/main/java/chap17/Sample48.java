package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Sample48 {

    public static void main(String[] args) {
        List<ScoreBoard> boards = Arrays.asList(
            new ScoreBoard("타노스", 60, 70, 80),
            new ScoreBoard("빵형", 80, 50, 40),
            new ScoreBoard("상도", 90, 90, 80)
        );
        
        boards.stream()
              .sorted()
              .collect(Collectors.toList())
              .forEach(System.out::println);
    }

}

@Data
@AllArgsConstructor
class ScoreBoard implements Comparable<ScoreBoard> {
    private String name;
    private int    score1;
    private int    score2;
    private int    score3;
    
    /**
     * 기본 정렬을 이름 역정렬로 정의함
     */
    @Override
    public int compareTo(ScoreBoard o) {
        return o.getName().compareTo(this.getName());
    }

}