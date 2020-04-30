package chap14;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.Supplier;

public class Sample28 {
    
    @MyAnnotation(value = "main")
    public void getService1(String service) {
    	System.out.println(service);
    }

    @MyAnnotation(value = "common")
    public void getService2(String service) {
    	System.out.println(service);
    }

	public static String function(Supplier<String> supplier) {
		return supplier.get();
	}
	
    public static void main(String[] args) throws Exception {
    	Factory factory = new Factory();
    	factory.run();
	}
}
class Factory {
	
	public void run() throws Exception {
		Sample24 obj = new Sample24();
//		Method[] methods = obj.getClass().getMethods();
		Method[] methods = obj.getClass().getDeclaredMethods();
	
		for(Method method : methods) {
			Annotation[] my = method.getAnnotations();
			if(method.isAnnotationPresent(MyAnnotation.class)) {
				
				MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
				System.out.println(myAnnotation.value() + "Service");
				String args = myAnnotation.value() + "Service";
				String[] param = new String[] {args};
				method.invoke(method, param);
			}
		}
	}
}

@Retention(RUNTIME)
@Target(METHOD)
@interface MyAnnotation {
	String value() default "home";
}