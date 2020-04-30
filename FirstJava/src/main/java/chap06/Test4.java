package chap06;

public class Test4 {
    public static void main(String[] args) {
        // 2부터 100인 자연수
        for(int i = 2; i <= 100; i++) {
            boolean f = true;
    
            //1보다 크고 자신보다 작은 자연수
            for(int j = 2; j < i; j++) {
                // 자신보다 작은 수로 나눠지는 수는 자연수가 아님
                if((i % j) == 0) {
                    f = false;
                }
            }
            if(f) System.out.printf("%d\t", i);
        }
    }
}