package chap02;

public class Sample15 {

    public static void main(String[] args) {
        final float PI1;   // 정의하지 않고 PI를 상수로 선언했다.
        PI1 = 3.14f;       // 최초 값을 선언한다. 이 후 PI값을 변경하면 오류가 발생한다.
        
        final var PI2;     //Cannot use 'var' on variable without initializer
        final var PI3 = 3.14f;
    }

}
