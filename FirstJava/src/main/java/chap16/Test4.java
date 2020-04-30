package chap16;

import java.util.Arrays;
import java.util.function.BiFunction;

public class Test4 {
    public static void main(String[] args) {
        var list = Arrays.asList(4, 3, 8, 9);
        Calculator cal = new Calculator();
        BiFunction<Integer, Integer, Integer> plus = (a, b) -> cal.plus(a, b);
        BiFunction<Integer, Integer, Integer> minus = (a, b) -> cal.minus(a, b);
//        BiFunction<Integer, Integer, Integer> plus = cal::plus;
//        BiFunction<Integer, Integer, Integer> minus = cal::minus;
        int sum = minus.apply(4, 3);
        sum = plus.apply(sum, 8);
        sum = plus.apply(sum, 9);
        System.out.println(sum);
    }
}

class Calculator {
    public int plus(int a, int b) {
        return a + b;
    }
    
    public int minus(int a, int b) {
        return a - b;
    }
}