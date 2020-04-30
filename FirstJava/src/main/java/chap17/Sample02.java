package chap17;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample02 {

    public static void main(String[] args) {
        // 1. 배열
        String[] strArr = {"빵형", "타노스", "상도"};
        int[] intArr = {3, 6, 9};
        double[] floatArr = {3.1, 4.2, 5.3};

        // 2. 스트림 생성
        Stream<String> strStm = Arrays.stream(strArr);
        IntStream      intStm = Arrays.stream(intArr);
        DoubleStream   douStm = Arrays.stream(floatArr);

        // 3. 출력
        strStm.forEach(System.out::println);
        intStm.forEach(System.out::println);
        douStm.forEach(System.out::println);
    }

}
