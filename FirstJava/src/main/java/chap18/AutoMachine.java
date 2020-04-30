package chap18;

public class AutoMachine implements AutoCloseable {

    private static AutoMachine machine;
    
    public static AutoMachine getInstance() {
        System.out.println("AutoMachine을 시작합니다.");
        machine = new AutoMachine();
        return machine;
    }
    
    public void run() throws Exception {
        System.out.println("AutoMachine이 동작합니다.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("AutoMachine을 종료합니다.");
        machine = null;
    }

}