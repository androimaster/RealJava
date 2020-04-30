package chap14;

import java.lang.reflect.Method;
import java.util.function.Supplier;

public class Test1 {
	public static void main(String[] args) {
		test();
	}

	@MyAnno(str="빵형", val=1002)
	public static void test() {
		Test1 obj = new Test1();
		
		Class<?> c = obj.getClass();
		try {
			Method   m = c.getMethod("test");
			MyAnno anno = m.getAnnotation(MyAnno.class);
			System.out.println(anno.str() + " : " + anno.val());
			
			String msg = anno.str() + " : " + anno.val();
			System.out.println(function(msg::toString));
			
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	
	public static String function(Supplier<String> supplier) {
		return supplier.get();
	}
}
