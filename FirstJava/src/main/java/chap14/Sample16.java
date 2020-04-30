package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Friend(name = "구미호")
public class Sample16 {
    public static void main(String[] args) {
        Sample16 sample = new Sample16();
        Friend friend = sample.getClass().getAnnotation(Friend.class);
        System.out.printf("내 친구는 %s", friend.name());
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Friend {
  String name();
}
