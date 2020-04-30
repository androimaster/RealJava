package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Sample05 {

    @Sample05AnnoField
    private String test;
    
    @Sample05AnnoField
    private Color1 color = Color1.RED;

    public static void main(String[] args) { }
    
    public void testMethod() { }
    
}

@Target(ElementType.FIELD)
@interface Sample05AnnoField { }

enum Color1 {
    RED, BLUE, ORANGE;
}
