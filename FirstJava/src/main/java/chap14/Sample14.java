package chap14;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;

/**
 * <p>14장의 Sample14입니다.</p>
 * <p>Sample14 클래스에  Documented 애너테이션이 사용된 애너테이션 정보를 보여줍니다.
 * @author promaster
 */
@Sample14Anno1
@Sample14Anno2
public class Sample14 {

    public static void main(String[] args) {
        char J = 74;
        char a = 97;
        char v = 118;
        
        System.out.printf("%c%c%c%c", J, a, v, a);
    }
    /**
     * <p>생성자의 설명을 적습니다.</p>
     * <p>아직 생성자를 배우지 않아서 뭔지 모릅니다.</p>
     */
    public Sample14() { }
    
    /**
     * <p>뭔가를 처리합니다.</p>
     * <p>반환값은 없습니다.</p>
     * @since 1.0
     */
    public void doSomething() {
    	
    }
}

@Documented
@Target(TYPE)
@interface Sample14Anno1 { }

@Target(TYPE)
@interface Sample14Anno2 { }
