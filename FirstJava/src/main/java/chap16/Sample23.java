package chap16;

import java.util.function.Function;

public class Sample23 {
    public static void main(String[] args) {
        Function<String, String> helloLambda = (name) -> HelloTo.hello(name);
        Function<String, String> helloStatic = HelloTo::hello;
        
        System.out.println(helloLambda.apply("빵형"));
        System.out.println(helloStatic.apply("파티쉐"));
    }
}

class HelloTo {
    public static String hello(String name) {
        return "Hello~ " + name;
    }
}