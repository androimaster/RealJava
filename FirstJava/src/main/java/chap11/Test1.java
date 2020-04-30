package chap11;

import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);

        System.out.println("시작 배열 : " + list);
        for(int times = 0; times < list.size() - 1; times++) {
            for(int i = 0; i < list.size() - (times+1); i++) {
                var target1 = list.get(i);
                var target2 = list.get(i+1);
                if(target1 > target2) {
                    list.set(i, target2);
                    list.set(i+1, target1);
                }
            System.out.println(target1 + " , " + target2 + " = " + list);
            }
        }
        System.out.println("최종 배열 : " + list);
    }
}
