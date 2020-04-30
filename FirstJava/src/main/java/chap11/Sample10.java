package chap11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Spliterator;

public class Sample10 {
	
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("dog");
        list.add("dog");
        list.add("cat");
        list.add("cat");
        list.add("lion");
        list.add("lion");
        System.out.println("<<ArrayList >>");
        System.out.println(list);

        var hs = new HashSet<String>();
        hs.addAll(list);
        System.out.println("\n<<HashSet>>");
        System.out.println(hs);

        System.out.println("\n<<'lion'을 추가한 후에 출력합니다.>>");
        hs.add("lion");   //이미 들어있는 'lion'을 추가합니다.
        hs.forEach(System.out::println);  //앞서 소개한 메서드 참조 기능으로 출력

        System.out.println("\n'dog'가 존재하나요? " + hs.contains("dog"));

        //Spliterator 
        System.out.println("\n<<Spliterator>>");
        Spliterator<String> namesSpliterator = hs.spliterator();
        namesSpliterator.forEachRemaining(System.out::println);  
    }
}
