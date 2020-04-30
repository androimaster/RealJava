package chap06;

public class Sample11 {
    public static void main(String[] args) {
        int i = 1;                 //초기식으로 1부터 출력해야 하니 1을 넣는다
       	
        do {
            for(int j = 0; j < i; j++) {
                System.out.print("*"); //실행문
            }
            System.out.println();
            i++;                   //증감식
        }
        while(i <= 5);            //출력될 값이 5를 넘어가면 반복문을 종료한다.
    }
}
