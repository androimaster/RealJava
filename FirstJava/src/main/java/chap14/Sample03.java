package chap14;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public class Sample03 {

    public static void main(String[] args) {
        @Sample03AnnoClass
        class C { }

        @Sample03AnnoRuntime
        class R { }

        System.out.println("클래스 명 : " + C.class.getName());
        System.out.println("Annotation 수 : " + C.class.getAnnotations().length);
        System.out.println("Annotations : " + Arrays.toString(C.class.getAnnotations()));
        System.out.println();
        System.out.println("클래스 명 : " + R.class);
        System.out.println("Annotation 수 : " + R.class.getAnnotations().length);
        System.out.println("Annotations : " + Arrays.toString(R.class.getAnnotations()));
    }

}

@Retention(RetentionPolicy.CLASS)
@interface Sample03AnnoClass { }

@Retention(RetentionPolicy.RUNTIME)
@interface Sample03AnnoRuntime { }
