package chap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sample07 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        
        list.add("dog");
        list.add("cat");
        list.add("lion");
        
        System.out.println("1. forEach");
        list.forEach((String x) -> System.out.println(x));
        
        System.out.println("\n2. for 문을 활용한 출력");
        for(int i = 0; i < list.size(); i++ ) {
        	System.out.println(list.get(i));
        }
        
        System.out.println("\n3. 향상된 for 문");
        for(String item : list) {
        	System.out.println(item);
        }
        
        System.out.println("\n4. Iterator를 활용한 출력");
        Iterator<String> it1 = list.iterator();
        while(it1.hasNext()) {
        	System.out.println(it1.next());
        }
        
        System.out.println("\n5. Iterator를 활용한 출력(람다식 활용)");
        Iterator<String> it2 = list.iterator();
        it2.forEachRemaining((n) -> System.out.println(n));
        
        System.out.println("\n6. Iterator를 활용한 출력(참조 메서드 활용)");
        Iterator<String> it3 = list.iterator();
        it3.forEachRemaining(System.out::println);
        
        System.out.println("\n7.Collection 정렬");
        System.out.println("정렬 전 - " + list.toString());
        Collections.sort(list);
        System.out.println("정렬 후1 - " + list.toString());
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("정렬 후2 - " + list.toString());
    }
}
