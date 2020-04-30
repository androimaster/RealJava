package chap18;

public class Sample14 {

    public static void main(String[] args) {
        AutoMachine machine = AutoMachine.getInstance();
        try {
            machine.run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            if(machine != null) {
                try {
                    machine.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

}