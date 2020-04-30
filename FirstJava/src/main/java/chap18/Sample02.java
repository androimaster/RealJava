package chap18;

import java.util.Arrays;

public class Sample02 {

    public static void main(String[] args) {
        int i = 5;
        
        int[] a = new int[i];
        for(int j=0; j <=i; j++) {
            a[j] = j;
            System.out.println(j);
        }
        System.out.println(Arrays.toString(a));
    }
}
