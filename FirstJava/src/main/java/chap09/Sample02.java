package chap09;

public class Sample02 {
    public static void main(String[] args) {
        Car car = new ElectricCar("red", "Hyundai"); //추상클래스 자료형
        car.printInfo();
        car.setColor("Gray");         //자손 클래스에 정의된 메서드는 사용할 수 없다
        car.printInfo();
    }	

}
