package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Friend1({"구미호", "둘리", "스누피"})
public class Sample17 {
    public static void main(String[] args) {
        Sample17 sample = new Sample17();
        Friend1 friend1 = sample.getClass().getAnnotation(Friend1.class);
        for(String friend : friend1.value()) {
            System.out.printf("내 친구는 %s\n", friend);
        }

    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface Friend1 {
    String[] value();
}
