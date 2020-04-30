package chap08;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Test2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idx = 0;
        Friend[] friends = new Friend[5];
        friends[idx++] = new Friend("Dooli", 60, "010-0001-0001");
        friends[idx++] = new Friend("Heedong", 52, "010-0002-0002");
        friends[idx++] = new Friend("Douner", 61, "010-0003-0003");
        friends[idx++] = new Friend("Ddochi", 62, "010-0004-0004");
        friends[idx++] = new Friend("Michol", 70, "010-0005-005");

        System.out.println("== List ==");
        for(Friend friend : friends) {
            System.out.println(friend.getName());
        }
        System.out.println();
        do {
            System.out.print("신상을 알고싶은 사람의 이름을 입력해주세요 : ");
            String in = sc.next();

            if("0".equals(in)) {
                System.out.println("종료합니다.");
                break;
            }
            else {
                for(Friend friend : friends) {
                    if(friend.getName().equals(in)) {
                        System.out.println(friend.toString() + "\n");
                    }
                }
            }
        } while(true);
    }

}

@Data
@AllArgsConstructor
class Friend {
    private String name;
    private int    age;
    private String phone;
}
