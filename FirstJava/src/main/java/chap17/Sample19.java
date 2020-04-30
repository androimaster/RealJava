package chap17;

import static java.util.stream.Collectors.toMap;

import java.util.Arrays;
import java.util.Map;

public class Sample19 {

    public static void main(String[] args) {
        String[][] level = {
            {"빵형", "초급"}, {"빵형", "중급"}, {"타노스", "중급"}, {"상도", "고급"}
        };
        
        Map map = Arrays.stream(level)
                        .collect(toMap(x -> x[0], x -> x[1], (x, y) -> x + ", " + y));
        System.out.println(map.toString());
    }

}
