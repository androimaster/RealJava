package chap11;

import java.util.ArrayList;
import java.util.List;

public class Sample03 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();

        //5개의 문자열을 추가한다
        arr.add("하나");
        arr.add("둘");
        arr.add("이 쩜 오");
        arr.add("셋");
        arr.add("넷");
        arr.add("다섯");

        //3번째 위치에 '이 쩜 오'를 삭제
        System.out.println("* 3번째 위치에 '이 쩜 오'를 삭제");
        arr.remove(2);
        for(String a : arr) {
            System.out.println(a);
        }

        //둘, 셋 삭제
        System.out.println("\n* 둘, 셋 삭제");
        List<String> delArr = new ArrayList<>();
        delArr.add("둘");  //삭제할 배열을 추가한다
        delArr.add("셋");
        arr.removeAll(delArr);
        for(String a : arr) {
            System.out.println(a);
        }

        //모두 삭제한다.
        System.out.println("\n*모두 삭제한다.");
        arr.removeAll(arr);
        for(String a : arr) {
            System.out.println(a);
        }

    }
}
