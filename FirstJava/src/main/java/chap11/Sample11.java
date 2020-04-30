package chap11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Sample11 {

    public static void main(String[] args) {
        var arr = new ArrayList<String>();
        arr.add("사자");
        arr.add("호랑이");
        arr.add("원숭이");
        
        System.out.println("1 > ArrayList를 TreeSet으로 가져옵니다.[addAll()]");
        var trs = new TreeSet<String>();
        trs.addAll(arr);
        System.out.println("TreeSet :: " + trs);
        
        System.out.println("\n2 > TreeSet에 타이거를 추가합니다.[add()]");
        trs.add("타이거");
        System.out.println("TreeSet :: " + trs);
        
        String addString = "토끼";
        System.out.printf("\n3 > TreeSet에 %s가 없으면 추가합니다.[contains()]\n", addString);
        if(trs.contains(addString)) 
            System.out.printf("TreeSet에 %s가 있습니다.\n", addString);
        else {
            System.out.printf("TreeSet에 %s가 없습니다. 그래서 추가합니다.\n", addString);
            trs.add(addString);
        }
        System.out.println("TreeSet :: " + trs);
        
        System.out.printf("\n4 > TreeSet에 %s보다 크거나 같은 값 중에 제일 가까운 값을 출력합니다.[ceiling()]\n", "'자'");
        System.out.printf("%s\n", trs.ceiling("자"));
        
        System.out.printf("\n5 > TreeSet에 %s보다 작거나 같은 값 중에 제일 가까운 값을 출력합니다.[floor()]\n", "'자'");
        System.out.printf("%s\n", trs.floor("자"));
        
        System.out.printf("\n6 > TreeSet에 %s보다 큰 값을 출력합니다.[higher()]\n", "'토끼'");
        System.out.printf("%s\n", trs.higher("토끼"));
        
        System.out.printf("\n7 > TreeSet에 %s보다 큰 값을 출력합니다.[lower()]\n", "'토끼'");
        System.out.printf("%s\n", trs.lower("토끼"));
        
        System.out.printf("\n8 > TreeSet에서 첫 번째 값을 출력합니다.[last()]\n");
        System.out.printf("%s\n", trs.first());
        
        System.out.printf("\n9 > TreeSet에서 마지막 번째 값을 출력합니다.[first()]\n");
        System.out.printf("%s\n", trs.last());
        
        System.out.printf("\n10 > Iterator로 내림차순으로 출력합니다.[descendingIterator()]\n");
        Iterator<String> it = trs.descendingIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        System.out.printf("\n11 > 첫 번째 요소를 반환 후 삭제합니다.[pollFirst()]\n");
        System.out.println("반환값  :: " + trs.pollFirst());
        System.out.println("TreeSet :: " + trs);
        
        System.out.printf("\n12 > 마지막 요소를 반환 후 삭제합니다.[pollLast()]\n");
        System.out.println("반환값 :: " + trs.pollLast());
        System.out.println("TreeSet :: " + trs);
    }

}
