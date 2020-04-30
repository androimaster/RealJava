package chap16;

public class Sample01 {

    public static void main(String[] args) {
        Sample01Function f = () -> System.out.println("샘플01테스트 출력");
        f.test();
    }

}

@FunctionalInterface
interface Sample01Function {
    public abstract void test();  //한 개의 추상 메서드
}
