package chap17;

import java.util.Arrays;
import java.util.List;

public class Sample37 {

    public static void main(String[] args) {
        //Sample23.Student 객체를 활용합니다.
        List<Score> scores = Arrays.asList(
            new Score("빵형", 61, 31, 31),
            new Score("타노스", 62, 32, 82),
            new Score("상도", 100, 30, 31)
        );
        
        boolean result1 = scores.stream()
                                .anyMatch(x -> x.getMat() > 39);
        System.out.println("수학 과락이 아닌 사람이 있나요? " + result1);

        boolean result2 = scores.stream()
                                .allMatch(x -> x.getKor() > 39);
        System.out.println("국어 과락은 없나요? " + result2);

        boolean result3 = scores.stream()
                                .noneMatch(x -> x.getEng() > 39);
        System.out.println("영어는 모두 과락인가요? " + result3);
    }

}
