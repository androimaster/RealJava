package chap13;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;

public class Sample08 {

    public static void main(String[] args) {
        int users = 14638;
        int views = 1500;
        NumberFormat nf = CompactNumberFormat.getCompactNumberInstance();
        System.out.printf("Youtube 구독자 %s\n", nf.format(users));
        System.out.printf("Java 영상 조회수 %s\n", nf.format(views));
    }

}
