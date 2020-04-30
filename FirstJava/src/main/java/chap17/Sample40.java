package chap17;

import java.util.Arrays;
import java.util.List;

public class Sample40 {

    public static void main(String[] args) {
        //Sample23.Student 객체를 활용합니다.
        List<Score> scores = Arrays.asList(
            new Score("빵형", 61, 31, 31),
            new Score("타노스", 62, 62, 82),
            new Score("상도", 94, 44, 41)
        );
        
        scores.stream()
              .map(
                   x -> {
                       if(x.getKor() < 40 || x.getEng() < 40 || x.getMat() < 40) {
                           x.setMsg("과락입니다.");
                       }
                       else if((x.getKor() + x.getEng() + x.getMat()) / 3 < 60) {
                           x.setMsg("불합격입니다.");
                       }
                       else {
                           x.setMsg("합격입니다.");
                       }
                       return x;
                   }
               )
              .forEach(System.out::println);
    }

}
