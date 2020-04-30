package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Autowired {
    String value();
}

class GreetingService {
    @Autowired("Cheol-su")
    public void greeting(String name){
        System.out.println("Hello, " + name);
    }
}

public class Sample25 {
    public static void main(String[] args) throws Exception {
        GreetingService service = new GreetingService();
        Method method = service.getClass().getMethod("greeting", String.class);
        if(method.isAnnotationPresent(Autowired.class)){
            Autowired anno = method.getAnnotation(Autowired.class);
            method.invoke(service, anno.value());
        }
	}
}

