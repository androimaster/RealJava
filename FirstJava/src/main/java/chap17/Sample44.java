package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Sample44 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("RED","bad", "BED", "Wed", "rad");
        list.stream()
            .filter(x -> 0 < x.toUpperCase().indexOf("ED"))
            .forEach(System.out::println);
        
        System.out.println("=======================");
        System.out.println("ED가 포함된 단어");
        System.out.println("=======================");
        Predicate<String> condition1 = x -> 0 < x.toUpperCase().indexOf("ED");
        list.stream()
            .filter(condition1)
            .forEach(System.out::println);

        System.out.println("=======================");
        System.out.println("ED가 포함되지 않은 단어");
        System.out.println("=======================");

        Predicate<String> condition2 = Predicate.not(condition1);
        list.stream()
            .filter(condition2)
            .forEach(System.out::println);
    }

}
