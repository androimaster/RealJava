package chap05;

import java.util.Arrays;

public class Sample06 {

    public static void main(String[] args) {
        String names = "빵형|상도|타노스|인호|학건";
        String[] arr = names.split("\\|");
        System.out.println("|" + Arrays.toString(arr));
        
        String names1 = "빵형&상도&타노스&인호&학건";
        String[] arr1 = names1.split("\\&");
        System.out.println("&" + Arrays.toString(arr1));
        
        String names2 = "빵형*상도*타노스*인호*학건";
        String[] arr2 = names2.split("\\*");
        System.out.println("*" + Arrays.toString(arr2));
        
        String names3 = "빵형=상도=타노스=인호=학건";
        String[] arr3 = names3.split("=");
        System.out.println("=" + Arrays.toString(arr3));
        
        String names4 = "빵형+상도+타노스+인호+학건";
        String[] arr4 = names4.split("\\+");
        System.out.println("+" + Arrays.toString(arr4));
        
        String names5 = "빵형^상도^타노스^인호^학건";
        String[] arr5 = names5.split("\\^");
        System.out.println("^" + Arrays.toString(arr5));
        
        String names6 = "빵형-상도-타노스-인호-학건";
        String[] arr6 = names6.split("-");
        System.out.println("-" + Arrays.toString(arr6));
    }
}
