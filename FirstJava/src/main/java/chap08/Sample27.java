package chap08;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

public class Sample27 {

    public static void main(String[] args) {
        //Person2 per1 = new Person(1);
        Person2 per1 = Person2.builder()
                              .no(1)
                              .build();

        //Person2 per2 = new Person(2, "Mary");
        Person2 per2 = Person2.builder()
                              .no(2)
                              .name("Mary")
                              .build();

        //Person2 per3 = new Person(3, "Peter", "010-1234-5678");
        Person2 per3 = Person2.builder()
                              .no(3)
                              .name("Peter")
                              .phone("010-1234-5678")
                              .build();
    }

}

@RequiredArgsConstructor
class Person2 {
    private final int no;
    private String name;
    private String phone;

    @Builder
    public Person2(int no, String name, String phone) {
        this.no = no;
        this.name = name;
        this.phone = phone;
    }
}
