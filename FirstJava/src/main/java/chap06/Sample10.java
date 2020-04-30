package chap06;

public class Sample10 {
    public static void main(String[] args) {
        int i = 1;                 //초기식으로 1부터 출력해야 하니 1을 넣는다
    
        while(i <= 10) {           //출력될 값이 10이 넘어가면 반복문을 종료한다.
            System.out.println(i); //실행문
            i++;                   //증감식
        }
    }
}
