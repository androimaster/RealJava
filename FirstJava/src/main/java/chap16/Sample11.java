package chap16;

import java.util.function.Function;

public class Sample11 {
    public static void main(String[] args) {
        Function<Integer, String> f = (i) -> {
            return switch(i) {
                case 1 -> "one";
                case 2 -> "two";
                case 3 -> "three";
                case 4 -> "four";
                case 5 -> "five";
                default -> throw new IllegalArgumentException("Unexpected value: " + i);
            };
        };
        
        // 정수가 들어가서 문자열이 나오는 결과 Function<Integer, String>
        System.out.println(f.apply(3));
    }
}
