package chap09.Sample04;

public class Parrot extends Pet{

    public Parrot(boolean wing, int legCount) { //생성자의 내용을 부모클래스로 값을 넘겨서 객체 생성한다
        super(wing, legCount);
    }

    @Override	
    public void run(String name) {
        System.out.printf("%s는 두발로 뜁니다.%n", name);
    }

    public void fly(String name) {
        System.out.printf("%s는 뛰지 않고 날라갑니다.%n", name);
    }
}
