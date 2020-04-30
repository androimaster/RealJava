package chap06;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int[] dap = {1, 1, 0, 0, 1};
        System.out.print("답 입력 > ");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine(); // 키보드로부터 값을 입력받는다
    
        //정답 출력
        System.out.print("정답    > ");
        for(int n : dap) {
            System.out.print(n);
        }
    
        System.out.print("\n결과    > ");
        int targetLoc = 0;
        for(char c : in.toCharArray()) {
            System.out.print( (c & dap[targetLoc++]) == 1 ? "O" : "X" );
        }
    }
}