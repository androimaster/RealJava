package chap08.Sample24;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Car {

    @NonNull
    private String color;        //차량색상
    private int    doors;        //문 수
    private String manufacturer; //제조사	

}
