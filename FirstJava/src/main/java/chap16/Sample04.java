package chap16;

public class Sample04 {

    public static void main(String[] args) {
        Runnable r = () -> {
        	System.out.println("익명 내부 클래스를 람다식으로 실행");
        };
        r.run();
    }

}
