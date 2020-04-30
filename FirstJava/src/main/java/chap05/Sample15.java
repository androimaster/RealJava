package chap05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample15 {

    public static void main(String[] args) {
        //배열에서 데이터 추가하는 방법 1
        var students1 = new String[7];
        students1[0] = "스노우 화이트";
        students1[1] = "멀린";
        students1[2] = "레지나";
        students1[3] = "애버러지";
        students1[4] = "잭";
        students1[5] = "아더";
        students1[6] = "한스";

        //배열에서 데이터 추가하는 방법 2
        var students2 = new String[] {
            "스노우 화이트", "멀린", "레지나", "애버러지", "잭", "아더", "한스"
        };

        //List에서 데이터 추가하는 방법 1
        List<String> students3 = new ArrayList<>();
        students3.add("스노우 화이트");
        students3.add("멀린");
        students3.add("레지나");
        students3.add("애버러지");
        students3.add("잭");
        students3.add("아더");
        students3.add("한스");

        //List에서 데이터 추가하는 방법 2
        List<String> students4 = Arrays.asList(
            "스노우 화이트", "멀린", "레지나", "애버러지", "잭", "아더", "한스"
        );
        System.out.println(Arrays.toString(students1) + " - Array 1");
        System.out.println(Arrays.toString(students2) + " - Array 2");
        System.out.println(students3 + " - List 1");
        System.out.println(students4 + " - List 2");
    }

}
