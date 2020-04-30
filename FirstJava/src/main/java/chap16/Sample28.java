package chap16;
 
import java.util.function.BiConsumer;

public class Sample28 {
 
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> plus1 = (a, b) -> new Plus(a, b);
        System.out.print("람다식 - ");
        plus1.accept(1, 2);
        
        BiConsumer<Integer, Integer> plus2 = Plus::new;
        System.out.print("생성자 참조 - ");
        plus2.accept(3, 4);
    }
}

class Plus {

    public Plus(int a, int b) {
        System.out.printf("%d + %d = %d\n", a, b, (a + b));
    }

}