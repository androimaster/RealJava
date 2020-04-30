package chap18;

public class Sample16 {

    public static void main(String[] args) {
        try(AutoMachine machine = AutoMachine.getInstance()
               ;AutoMachine2 machine2 = AutoMachine2.getInstance()) {
                machine.run();
                machine2.run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("모든 AutoMachine이 종료되었습니다.");
        }
    }

}