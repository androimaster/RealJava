package chap11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample12 {

    public static void main(String[] args) {
        var map = new HashMap<String, Integer>(); //키:언어, 값:순위
        map.put("Java"       , 1);
        map.put("C"          , 2);
        map.put("C++"        , 3);
        map.put("C#"         , 4);
        map.put("Python"     , 5);
        map.put("JavaScript" , 6);
        map.put("PHP"        , 7);
        map.put("Visual Basic .NET" , 8);
        map.put("Perl"       , 9);
        map.put("Delphi"     , 10);

        Map beforeMap = (Map) map.clone();
        Set<String> keys = map.keySet();

        //향상된 for문
        System.out.println("==Enhanced for Loop");
        for(String key : keys) {
            System.out.println(key);
        }

        //람다식
        System.out.println("==Lambda expression[16장]");
        keys.forEach( (s) -> System.out.println(s) );

        //메서드 참조
        System.out.println("==Method references[16장]");
        map.keySet().forEach(System.out::println);

        System.out.println(map.toString());

        //총 맵의 매핑 수
        System.out.println("맵의 매핑 수 : " + map.size());

        // Ruby가 10위로 들어오고 Delphi가 10권 밖으로 사라짐
        System.out.println("\n==Ruby가 10위로 들어오고 Delphi가 10권 밖으로 사라짐");
        if(map.containsKey("Delphi")) { //주민번호가 있으면 제거
            map.remove("Delphi");
        }
        else {
            System.out.println("Delphi가 없습니다.");
        }
        map.put("Ruby"     , 10);
        System.out.println(map.toString());

        //Java가 순위에서 1계단 내려오고 C가 한계단 올라감(16장 학습 내용)
        map.computeIfPresent("Java", (String key, Integer value)-> ++value);
        map.computeIfPresent("C", (String key, Integer value)-> --value);
        System.out.println("After :: " + map.toString());
        System.out.println("Before :: " + beforeMap);
    }
}
