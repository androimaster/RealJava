package chap02;

public class Sample03 {

    /**
     * 자료형에 대해서 학습니다.
     * @param args
     */
    public static void main(String[] args) {
        byte   a1 = -128;    //byte 최솟값
        byte   a2 = 127;     //byte 최댓값
        short  b1 = -32768;  //short 최솟값
        short  b2 = 32767;   //short 최댓값
        int    c  = 10000;   //int는 그냥 숫자를 적는다.
        long   d  = 10000L;  //long 자료형은 숫자 뒤에 L이나 l을 꼭 붙입니다.
        float  e  = 10.1f;   //float형은 뒤에 F나 f를 붙입니다.
        double f  = 10.1;    //소수점이 있는 숫자를 입력하면 자동으로 double로 인식합니다.
        
        System.out.printf("byte : %d,\t\t short : %d%n", a1, b1);
        System.out.printf("int : %d,\t\t long : %d%n", c, d);
        System.out.printf("float : %f,\t double : %f%n", e, f);
    }

}
