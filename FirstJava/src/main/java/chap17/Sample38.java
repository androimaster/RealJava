package chap17;

import java.util.Arrays;
import java.util.List;

public class Sample38 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 6, 2, 8, 10);
        //요소들 중에 순서와 상관없이 요소를 찾는다.
        list.stream().findAny().ifPresent(System.out::println);
        
        //요소들 중에 첫 요소를 찾아서 얻는다.
        list.stream().findFirst().ifPresent(System.out::println);

        list.stream()
            .filter(x -> x > 2)  //중간 연산을 통해서 2보다 큰 수만 요소를 걸러낸다.
            .findAny()           //순서와 상관없이 요소를 찾는다.
            .ifPresent(System.out::println);

        list.parallelStream()
            .filter(x -> x > 2)  //중간 연산을 통해서 2보다 큰 수만 요소를 걸러낸다.
            .findAny()           //순서와 상관없이 요소를 찾는다.
            .ifPresent(System.out::println);
                
        list.stream()
            .filter(x -> x > 2)  //중간 연산을 통해서 2보다 큰 수만 요소를 걸러낸다.
            .findFirst()         //요소 중에 첫번째 요소르 찾는다.
            .ifPresent(System.out::println);

        list.parallelStream()
            .filter(x -> x > 2)  //중간 연산을 통해서 2보다 큰 수만 요소를 걸러낸다.
            .findFirst()         //요소 중에 첫번째 요소르 찾는다.
            .ifPresent(System.out::println);
    }
}
