package chap09;

public class ElectricCar extends Car{

    public ElectricCar(String color, String manufacturer) {
        super(color, manufacturer);
    }

	public void printInfo() {
        System.out.println("이 차의 색 : " + this.color);
        System.out.println("이 차는 " + fillUp());
        System.out.println("이 차는 " + this.manufacturer + "에서 생산합니다.");
    }

	@Override
    public String fillUp() {
        return "전기를 충전합니다.";
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}
