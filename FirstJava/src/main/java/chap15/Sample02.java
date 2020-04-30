package chap15;

public class Sample02 {

    public static void main(String[] args) {
        //대상 문자열
        String str = "1234567890";
        System.out.println(str.matches("^[0-9]*$"));
    }
}
