package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Sample08 {

    private String test;

    public static void main(String[] args) { }

    @Sample08AnnoConstructor
    public Sample08(String test) {
        this.test = test;
    }

}

@Target(ElementType.CONSTRUCTOR)
@interface Sample08AnnoConstructor { }