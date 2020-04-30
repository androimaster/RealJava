package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Sample07 {

    private String test;

    public static void main(String[] args) { }
    
    public void testMethod(@Sample07AnnoParameter int testNo) { }
    
}

@Target(ElementType.PARAMETER)
@interface Sample07AnnoParameter { }