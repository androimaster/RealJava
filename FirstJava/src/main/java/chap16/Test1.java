package chap16;

public class Test1 {

    public static void main(String[] args) {
        BiTest test = (a, b) -> a + "와 " + b + "가 매개변수로 넘어왔습니다.";
        
        String a = "유튜브";
        String b = "네이버";
        System.out.printf(test.apply(a, b));
    }

}

@FunctionalInterface
interface BiTest {
    abstract String apply(String a, String b);
}