package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Sample17 {

    public static void main(String[] args) {
        //로또 당첨번호 5, 12, 25, 26, 38, 45 + 23
        List<Integer> luckyNo = Arrays.asList(5, 12, 25, 26, 38, 45);
        Predicate<List<Integer>> isLucky  = Predicate.isEqual(luckyNo);
        
        List<Integer> myNo = Arrays.asList(6, 13, 26, 27, 39, 46);
        if(isLucky.test(myNo)) {
            System.out.println("로또 1등 당첨입니다. 축하합니다.");
        }
        else {
            System.out.println("로또 1등이 아닙니다.");
        }
    }

}
