package chap16;

import java.util.Scanner;
import java.util.function.Predicate;

public class Sample15{

    public static void main(String[] args) {
        Predicate<Integer> isOdd  = (s)-> (s % 2) == 1; 
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수를 입력하세요 : ");
        sc.hasNextInt();
        System.out.println(isOdd.test(sc.nextInt()));
    }

}
