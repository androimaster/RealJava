package chap16;

import java.util.function.Predicate;

public class Sample16{

    public static void main(String[] args) {
        //10보다 크고 20보다 작은 수
        int a = 12;
        int b = 33;
        
        Predicate<Integer> isMin  = (s) -> s > 10;
        Predicate<Integer> isMax  = (s) -> s < 20;
        
        System.out.println(isMin.and(isMax).test(a));
        System.out.println(isMin.and(isMax).test(b));
    }

}
