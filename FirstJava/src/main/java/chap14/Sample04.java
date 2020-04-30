package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Sample04AnnoClass
public class Sample04 {
    private String test;

    public static void main(String[] args) { }

    public void testMethod() { }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)  //Class, interface, @interface, enum
@interface Sample04AnnoClass { }
