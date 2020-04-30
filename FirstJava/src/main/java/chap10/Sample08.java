package chap10;

class Computer<T extends ComputerPart> {
    private T component;

    public void toInfo() {
        System.out.println(component.getClass().getName());
    }

    public Computer() {}

    public Computer(T component) {
        this.component = component;
    }

    public void setComponent(T component) {
        this.component = component;
    }
}

//컴퓨터 내장 부품 대상 객체
class ComputerPart {}

//그래픽카드
class Graphics extends ComputerPart {}

//메모리
class Memory extends ComputerPart {}

//모니터
class Monitor {}

public class Sample08 {
    public static void main(String[] args) {
        Computer<ComputerPart> vga = new Computer<ComputerPart>();
        vga.setComponent(new Graphics());
//      vga.setComponent(new Monitor());  //ComputerPart를 상속받지 않는 객체는 제한됨
        vga.toInfo();

        Computer<ComputerPart> mem = new Computer<>(new Memory());   //생성자를 통한 객체 생성
//Computer<ComputerPart> mem = new Computer<>(new Monitor()); //ComputerPart를 상속받는 객체로 제한됨
        mem.toInfo();
    }	
}
