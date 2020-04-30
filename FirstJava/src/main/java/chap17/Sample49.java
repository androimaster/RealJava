package chap17;

import java.util.Arrays;
import java.util.List;

public class Sample49 {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(3, 6, 9, 3, 6, 9, 1, 2, 3);
        //중복을 모두 제거하고 list 출력
        numberList.stream()
                  .distinct()
                  .sorted()
                  .forEach(System.out::println);
    }

}
