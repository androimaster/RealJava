package chap14;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

@Friend2(name = "구미호") 
@Friend2(name = "둘리") 
@Friend2(name = "스누피")
public class Sample18 {
    public static void main(String[] args) {
        Sample18 sample = new Sample18();
        Friends friends = sample.getClass().getAnnotation(Friends.class);

        System.out.println("## Annotation info ##");
        System.out.println("** Arrays.toString()");
        System.out.println(Arrays.toString(friends.value()));

        System.out.println("\n** for expression");
        for(int i = 0; i < friends.value().length; i++) {
        	System.out.println(friends.value()[i]);
        }

        System.out.println("\n** Lambda & Stream");
        Arrays.stream(friends.value()).forEach(System.out::println);

        System.out.println("\n\n## Value info ##");		
        System.out.println("** for expression");
        for(int i = 0; i < friends.value().length; i++) {
            Friend2 friend = friends.value()[i];
            System.out.println(friend.name());
        }
        
        System.out.println("\n** Lambda & Stream");
        Arrays.stream(friends.value()).forEach(
            v -> {
                System.out.println(v.name());
            }
        );
    }
}

@Repeatable(Friends.class)
@interface Friend2 {
    String name();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Friends {
    Friend2[] value();
}
