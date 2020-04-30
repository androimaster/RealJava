package chap14;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;

import java.lang.annotation.Target;

public class Sample10 {

    public static void main(String[] args) { }
}

@Target(ANNOTATION_TYPE)
@interface Sample10AnnoAnnotationType { }

@Sample10AnnoAnnotationType
@interface Sample10Anno { }