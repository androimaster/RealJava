package chap05;

import java.util.Arrays;

public class Sample12 {

    public static void main(String[] args) {
        String[] han1 = new String[]
            { "라면", "미역국", "떡볶이", "수제비", "갈비탕", "순대국"};

        String[] han2 = Arrays.copyOf(han1, han1.length - 1);
        String[] han3 = Arrays.copyOf(han1, han1.length - 2);
        String[] han4 = Arrays.copyOf(han1, han1.length - 3);
        String[] han5 = Arrays.copyOf(han1, han1.length - 4);
        String[] han6 = Arrays.copyOf(han1, han1.length - 5);

        System.out.println(Arrays.toString(han1));
        System.out.println(Arrays.toString(han2));
        System.out.println(Arrays.toString(han3));
        System.out.println(Arrays.toString(han4));
        System.out.println(Arrays.toString(han5));
        System.out.println(Arrays.toString(han6));

        System.out.println("\n첫 번째와 마지막 요소를 제거하고 복사하여 출력 ==");
        String[] cp = Arrays.copyOfRange(han1, 1, han1.length - 1);
        System.out.println(Arrays.toString(cp));
    }

}
