package chap04;

public class Sample11 {

    public static void main(String[] args) {
        int a =  60; //0000 0000 0000 0000 0000 0000 0011 1100
        int b = -10; //1111 1111 1111 1111 1111 1111 1111 0110
        System.out.println("* NOT");
        System.out.printf("[%32s] ~ [%32s] = %d ~ %d \n"
                , Integer.toBinaryString(a)
                , Integer.toBinaryString(~a)
                , a
                , ~a);
        System.out.printf("[%32s] ~ [%32s] = %d ~ %d \n"
                , Integer.toBinaryString(b)
                , Integer.toBinaryString(~b)
                , b
                , ~b);
    }

}
