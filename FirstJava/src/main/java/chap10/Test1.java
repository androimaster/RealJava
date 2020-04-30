package chap10;

import lombok.Builder;

public class Test1 {

    public static void main(String[] args) {
        Person superman = Person.builder()
                                .name("슈퍼맨")
                                .age(32)
                                .hight(190)
                                .weight(100)
                                .phone("1511-1151")
                                .build();

        System.out.println(superman.toString());
    }

}

class Person {
    private String name;   //이름
    private int age;       //나이
    private float hight;   //키
    private float weight;  //몸무게
    private String phone;  //연락처

    @Builder
    public Person(String name, int age, float hight, float weight, String phone) {
        this.name = name;
        this.age = age;
        this.hight = hight;
        this.weight = weight;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", hight=" + hight + ", weight=" + weight + ", phone=" + phone + "]";
    }
}
