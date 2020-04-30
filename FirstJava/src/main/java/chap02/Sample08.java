package chap02;

public class Sample08 {
    public static void main(String[] args) {
        int a = 65;
        byte b = (byte)a; //int를 byte로 명시적 형 변환
        System.out.println(b);

        b = (byte)(a + 1);  // a + 1 정수 연산 후 byte로 명시적 형 변환
        System.out.println(b);

        a = b;              // byte b를 더 큰 번위를 갖는 int a에 자동 형 변환
        System.out.println(b);

        b = (byte) a;      // int a를 byte b로 작은 범위인 byte로 강제 형 변환
        System.out.println(b);
    }
}
