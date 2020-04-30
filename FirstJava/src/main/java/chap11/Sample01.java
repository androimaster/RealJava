package chap11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Sample01 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList();

        //5개의 문자열을 추가한다
        arr.add("하나");
        arr.add("둘");
        arr.add("셋");
        arr.add("넷");
        arr.add("다섯");

        //3번째 위치에 '둘 쩜 오'를 삽입
        arr.add(2, "둘 쩜 오");

        for(String a : arr) {
            System.out.println(a);
        }

    }
}
