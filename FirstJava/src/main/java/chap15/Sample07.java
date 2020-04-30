package chap15;

public class Sample07 {

    public static void main(String[] args) {
        //대상 문자열
        String[] str = {"ASDF12", "123456", "QWERTY", "as45aa", "567jkl"};
        String regex = "[^0-9]";

        for(String data : str) {
            System.out.printf("%s \t %S\n", data, data.replaceAll(regex, ""));
        }
    }
}
