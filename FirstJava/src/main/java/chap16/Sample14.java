package chap16;

import java.util.function.Function;

public class Sample14 {

    public static void main(String[] args) {
        Function<Integer, Integer> fun = Function.identity();
        System.out.println(fun.apply(100));
    }

}
