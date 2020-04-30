package chap15;

public class Sample03 {

    public static void main(String[] args) {
        //대상 문자열
        String[] str = {"ASDF12", "123456", "QWERTY", "as45aa", "567jkl"};
        String regex = "^[0-9A-Z]{6}$";
        for(String data : str) {
            System.out.printf("%s \t %b\n", data, data.matches(regex));
        }
    }
}
