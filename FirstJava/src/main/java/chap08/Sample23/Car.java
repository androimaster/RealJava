package chap08.Sample23;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String color;        //차량색상
    private int    doors;        //문 수
    private String manufacturer; //제조사
    
    @Override
    public String toString() {
        return "Car [color=" + color + ", doors=" + doors + ", manufacturer=" + manufacturer + "]";
    }

}
