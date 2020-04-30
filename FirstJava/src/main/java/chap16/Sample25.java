package chap16;

import java.util.function.BiFunction;

public class Sample25 {

    public static void main(String[] args) {
        Math math = new Math();
        
        //2개의 메서드를 갖고 1개의 반환형을 갖는 함수형 인터페이스
        BiFunction<Integer, Integer, Integer> minus1 = (a, b) -> math.minus(a, b);
        BiFunction<Integer, Integer, Integer> minus2 = math::minus;

        System.out.println("람다식 - " + minus1.apply(10, 2));
        System.out.println("메서드 참조 - " + minus2.apply(5 , 2));
    }

}

class Math {
    //2개의 인자를 갖고 int 반환형을 갖는 메서드
    public int minus(int a, int b) {
        return a - b;
    }
}