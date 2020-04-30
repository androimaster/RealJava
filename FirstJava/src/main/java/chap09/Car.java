package chap09;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Car {
    protected String color;            //색
    protected String manufacturer;     //제조사

    public abstract String fillUp(); //휘발류|등유|전기를 넣습니다.

    public void printInfo() {
        System.out.println("이 차의 색 : " + this.color);
        System.out.println("이 차는 " + fillUp());
        System.out.println("이 차는 " + this.manufacturer + "에서 생산합니다.");
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}
