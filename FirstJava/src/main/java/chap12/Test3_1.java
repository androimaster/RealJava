package chap12;

public class Test3_1 {
    public static void main(String[] args) {
        Compute.PLUS.getResult(3, 4);
    }
}

enum Compute {
    PLUS {
        @Override
        void getResult(int a, int b) {
            System.out.printf("%d + %d = %d", a, b, a + b);
        }
    },
    MINUS {
        @Override
        void getResult(int a, int b) {
            System.out.printf("%d - %d = %d", a, b, a - b);
        }
    },
    TIMES {
        @Override
        void getResult(int a, int b) {
            System.out.printf("%d * %d = %d", a, b, a * b);
        }
    },
    DIVIDE {
        @Override
        void getResult(int a, int b) {
            System.out.printf("%d / %d = %d", a, b, a / b);
        }
    };

    abstract void getResult(int a, int b);
}
