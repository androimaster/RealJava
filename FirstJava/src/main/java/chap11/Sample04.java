package chap11;

import java.util.ArrayList;
import java.util.List;

public class Sample04 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();

        //5개의 문자열을 추가한다
        arr.add("하나");
        arr.add("둘");
        arr.add("이 쩜 오");
        arr.add("셋");
        arr.add("넷");
        arr.add("다섯");

        for(int i=0; i < arr.size(); i++) {
            System.out.printf("%d번 - %s%n",(i + 1), arr.get(i));
        }

    }
}
