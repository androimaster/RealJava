package chap14;

import static java.lang.annotation.ElementType.TYPE_USE;

import java.lang.annotation.Target;
import java.util.HashMap;

public class Sample13 { 
    public static void main(String[] args) {
        var map = new HashMap<@UseTest String, @UseTest String>();

        //Sample12의 Person 클래스
        Person<@UseTest String> person = new Person<>();
    }
}

@Target(TYPE_USE)
@interface UseTest { }
