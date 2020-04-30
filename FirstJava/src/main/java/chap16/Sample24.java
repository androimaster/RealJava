package chap16;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Sample24 {

    public static void main(String[] args) {
        String greeting = "Hello";
        Consumer<String> consumer = System.out::println;  //static 메서드 참조
        consumer.accept(greeting);
        writeString(greeting::toString);                  //인스턴스 메서드 참조
    }
    
    public static void writeString(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

}