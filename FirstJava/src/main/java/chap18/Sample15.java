package chap18;

public class Sample15 {

    public static void main(String[] args) {
        try(AutoMachine machine = AutoMachine.getInstance()) {
            machine.run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}