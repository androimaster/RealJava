package chap17;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Sample16 {

    public static void main(String[] args) {
        int         sum1 = 0;
        OptionalInt sum2;
        
        sum1 = IntStream.rangeClosed(7, 10)
                        .reduce(6, Integer::sum);
        System.out.println("int로 반환하는 reduce 문 결과 : " + sum1);
        
        sum2 = IntStream.rangeClosed(6, 10)
                .reduce(Integer::sum);
        System.out.println("int로 반환하는 reduce 문 결과 : " + sum2.getAsInt());

        OptionalInt sum3 = OptionalInt.empty();
        if(sum3.isEmpty()) {
            System.out.println("sum3은 값이 비었어요");
        }
        
        System.out.println("** OptionalInt는 OptionalInt.of(value)로 값을 넣습니다.");
        sum3 = OptionalInt.of(6);
        
        if(sum3.isPresent()) {
            System.out.println("값이 있을 경우엔 getAsInt()로 가져옵니다. " + sum3.getAsInt());
            System.out.println("그냥 가져오면 이렇게 찍혀요 -> " + sum3);
        }
        else 
            System.out.println("값없다");
        
        IntStream.rangeClosed(6, 10)
                 .reduce(Integer::sum)
                 .ifPresent(System.out::println);
        
    }

}
