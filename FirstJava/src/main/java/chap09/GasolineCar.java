package chap09;

public class GasolineCar extends Car{

    public GasolineCar(String color, String manufacturer) {
        super(color, manufacturer);
    }

    public String fillUp() {
        return "휘발유를 주유합니다.";
    }

}
