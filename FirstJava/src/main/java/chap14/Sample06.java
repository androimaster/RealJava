package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Sample06 {

    private String test;
    
    private Color1 color = Color1.RED;

    public static void main(String[] args) { }
    
    @Sample06AnnoMothod
    public void testMethod() { }
    
}

@Target(ElementType.METHOD)
@interface Sample06AnnoMothod { }