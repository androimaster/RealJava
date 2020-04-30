package chap08;

import java.util.Arrays;

import lombok.Builder;
import lombok.ToString;

public class Test4 {

    public static void main(String[] args) {
        Member[] members = new Member[3];
        members[0] = Member.builder()
                           .name("빵형")
                           .age(10)
                           .build();
        
        members[1] = Member.builder()
                           .name("타노스")
                           .age(8)
                           .build();
        members[2] = Member.builder()
                           .name("상도")
                           .age(9)
                           .build();
        
        System.out.println(Arrays.deepToString(members));
    }
}

@ToString
class Member {
    String name;
    int age;
    
    @Builder
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
}