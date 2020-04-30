package chap12;

public class Test3_2 {
    public static void main(String[] args) {
        Compute.PLUS.getResult(3, 4);
    }
}

enum Compute1 {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE;

    public void getResult(int a, int b) {
        switch(this) {
            case PLUS -> System.out.printf("%d + %d = %d", a, b, a + b);
            case MINUS -> System.out.printf("%d + %d = %d", a, b, a + b);
            case TIMES -> System.out.printf("%d + %d = %d", a, b, a + b);
            case DIVIDE -> System.out.printf("%d + %d = %d", a, b, a + b);
        }
    }
}
