package chap16;

public class Sample02 {

    public static void main(String[] args) {
        Sample02Function f = (n) -> System.out.printf("당신은 %s이군요!", n);
        f.test("빵형");
    }

}

@FunctionalInterface
interface Sample02Function {
    public abstract void test(String name);  //한 개의 매개 변수가 있는 추상 메서드
}
