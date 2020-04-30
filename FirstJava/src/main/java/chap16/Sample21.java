package chap16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Sample21 {

    public static void main(String[] args) {
        //Function은 매개변수와 반환 자료형을 각각 정의
        Function<String, String> sourceFile = p -> p + ".java";
        
        //UnaryOperator은 매개변수와 반환 자료형을 하나로 정의
        UnaryOperator<String> classFile = (String p) ->  p + ".class";
        
        System.out.println(sourceFile.apply("Sample21"));
        System.out.println(classFile.apply("Sample21"));
        
        Arrays.asList(1,2,3,4,5).forEach(System.out::println);
        
        List<String> list = new ArrayList<>();
        list.add("dog");
        list.add("cat");
        list.add("lion");
        
        System.out.println("1. forEach");
        list.forEach(System.out::println);

    }

}
