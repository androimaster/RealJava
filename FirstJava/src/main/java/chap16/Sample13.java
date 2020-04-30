package chap16;

import java.util.function.Function;

public class Sample13 {
    public static void main(String[] args) {
        // 입력된 문자열을 숫자로 변환
        Function<String, Integer> work = s -> {
            System.out.println("- 입력된 문자열을 숫자로 변환합니다.");
            return Integer.parseInt(s);
        };
        
        // 입력된 숫자를 문자열로 변환
        Function<Integer, String> after = i -> {
            System.out.println("- 입력된 숫자를 문자열로 변환합니다.");
            return "" + i;
        };
        
        System.out.println("문자열 '123'을..");
        
        if(work.andThen(after).apply("123") instanceof String) {
            System.out.println("String입니다.");
        }
        else {
            System.out.println("String이 아닙니다.");
        }
    }
}
