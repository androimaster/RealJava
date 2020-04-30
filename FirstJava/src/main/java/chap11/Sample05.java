package chap11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sample05 {

    static List<String> list1 = new ArrayList<>();
    static List<String> list2 = new LinkedList<>();

    public static void main(String[] args) {

        //1. 순차입력
        list1.add("dog");
        list1.add("cat");
        list1.add("lion");

        list2.add("dog");
        list2.add("cat");
        list2.add("lion");
        toString("1. 순차입력");

        //2. 삽입
        list1.add(2, "tiger");
        list2.add(2, "tiger");
        toString("2. 중간삽입");

        //3. 중간삭제
        list1.remove(2);
        list2.remove(2);
        toString("3. 중간삭제");

    }

    public static void toString(String title) {
        System.out.printf("%n== %s ==%n", title);
        System.out.println("ArrayList  : " + list1);
        System.out.println("LinkedList : " + list2);
    }
}
