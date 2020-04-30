package chap16;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Sample26 {

    public static void main(String[] args) {
        var list = Arrays.asList( new Person(1, "빵형")
                                , new Person(2, "상도")
                                , new Person(3, "인호")
                                , new Person(4, "학건"));
        System.out.println("== 람다식");
        list.forEach(x -> x.toObjString());
        System.out.println("== 메서드 참조");
        list.forEach(Person::toObjString);
        
    }

}

@Getter
@Setter
@AllArgsConstructor
class Person {
    private Integer no;
    private String  name;
    
    public void toObjString() {
        System.out.println("Person [no=" + no + ", name=" + name + "]");
    }
}