package chap16;

import java.util.function.Consumer;

public class Sample08 {
    public static void main(String[] args) {
        Consumer<String> c = x -> {
        	System.out.printf("%s는 1개의 매개변수는 있지만 반환할 자료형은 없습니다.", x.toUpperCase());
        };
        c.accept("Consumer");
    }
}