package chap18;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sample06 {

    public static void main(String[] args) {
        int i = 5;
        try {
           int[] a = new int[i];
           for(int j = 0; j < i; j++) {
               a[j] = j;
               System.out.println(j);
           }
           System.out.println(Arrays.toString(a));
           
           System.out.println(1/0);
           
           IntStream.rangeClosed(1, 50000)
                    .forEach(System.out::println);
        }
        catch (Exception e) {
            System.out.println("Exception 오류 발생 - " + e.getMessage());
        }
    }

}
