package chap08;

public class Test3_1 {

    public static void main(String[] args) {
        System.out.println(concat("학교종이", "땡땡땡"));
        System.out.println(concat("객체지향", "패키지", "클래스", "객체", "접근제어자", "롬복"));
    }

    public static String concat(String words1, String words2) {
        return words1 + words2;
    }

    public static String concat(String words1, String words2, String words3, String words4, String words5, String words6) {
        return words1 + words2 + words3 + words4 + words5 + words6;
    }
}