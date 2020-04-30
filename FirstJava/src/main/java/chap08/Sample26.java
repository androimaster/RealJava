package chap08;

import lombok.RequiredArgsConstructor;

public class Sample26 {

    public static void main(String[] args) {
        Person per1 = new Person(1);
        Person per2 = new Person(2, "Mary");
        Person per3 = new Person(3, "Peter", "010-1234-5678"); //생성자를 또 추가해야 함
    }

}

@RequiredArgsConstructor
class Person {
    private final int no;
    private String name;
    private String phone;

    public Person(int no, String name) {
        this.no = no;
        this.name = name;
    }
}
