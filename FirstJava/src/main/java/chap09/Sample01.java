package chap09;

public class Sample01 {

    public static void main(String[] args) {
        ElectricCar car1 = new ElectricCar("red", "Hyundai");
        car1.printInfo();
        System.out.println("==================");
        GasolineCar car2 = new GasolineCar("black", "Kia");
        car2.printInfo();
    }

}
