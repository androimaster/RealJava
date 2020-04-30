package chap09;

import lombok.Getter;
import lombok.Setter;

public class Test2 {

    public static void main(String[] args) {
        
    }

}


abstract class Person {
    @Setter
    @Getter
    private String job = "일반인";
    
    public abstract void action();
}

class CEO extends Person {

    public CEO() {
        setJob("CEO");
    }

	@Override
    public void action() {
        String msg = "저는 " + getJob() + "입니다. 사표 내세요"; 
        System.out.println(msg);
    }

}