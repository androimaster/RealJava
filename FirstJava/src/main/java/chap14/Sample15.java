package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

public class Sample15 {

    public static void main(String[] args) {
        System.out.println("Annotations : " + Arrays.toString(TargetClass.class.getAnnotations()));
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface NotInheritClass { }

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface InheritClass { }

@InheritClass
@NotInheritClass
class SuperClass { }

class TargetClass extends SuperClass { }
