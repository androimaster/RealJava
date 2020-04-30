package chap17;

import java.util.stream.IntStream;

public class Test1 {
	
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 9)
                 .forEach(x -> {
                      IntStream.rangeClosed(1, 9)
                               .forEach(y -> {
                                        System.out.println(x + " * " + y + " = " + (x * y));
                                    }
                                );
                  }
         );
        //IntStream.range(1, 10).forEach(x -> IntStream.range(1, 10).forEach(y -> System.out.println(x + " * " + y + " = " + (x * y))));
    }
    
}