package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Sample09 {

    private String test;

    public static void main(String[] args) { }

    public void test() {
        @Sample09AnnoLocalVariable
        String test = this.test;
    }

}

@Target(ElementType.LOCAL_VARIABLE)
@interface Sample09AnnoLocalVariable { }