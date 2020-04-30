package chap18;

public class AutoMachine2 implements AutoCloseable {

    private static AutoMachine2 machine;
    
    public static AutoMachine2 getInstance() {
        System.out.println("AutoMachine2을 시작합니다.");
        machine = new AutoMachine2();
        return machine;
    }
    
    public void run() throws Exception {
        System.out.println("AutoMachine2이 동작합니다.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("AutoMachine2을 종료합니다.");
        machine = null;
    }

}