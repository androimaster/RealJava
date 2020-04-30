package chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface NullCheck { }

@AllArgsConstructor
@ToString
public class Test2 {
	@NullCheck
	public String a;
	
	@NullCheck
	public String b;

	public static void main(String[] args) throws Exception {
		Test2 test = new Test2("apple", null);
		test.nullCheck(test);
	}
	
	public void nullCheck(Test2 obj) throws Exception {
		Field[] fields = obj.getClass().getFields();
		for(Field field : fields) {
            //@NullCheck 애너테이션이 있는지 확인한다.
            if (field.isAnnotationPresent(NullCheck.class)) {
            	NullCheck anno = field.getAnnotation(NullCheck.class);
                String nullStr = anno.toString();
                if(field.get(obj) == null) {
                	System.out.printf("%s 필드의 값이 null 입니다.\n",field.getName());
                }
            }
        }
	}
}