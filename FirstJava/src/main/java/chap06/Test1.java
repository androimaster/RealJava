package chap06;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] data = new int[cnt];
    
        // 배열에 데이터를 담는다.
        for(int i = 0; i < data.length; i++) {
            data[i] = (i+1);
        }
    
        //배열을 출력한다.
        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}

