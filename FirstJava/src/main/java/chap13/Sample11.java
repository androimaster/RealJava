package chap13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Sample11 {

    public static void main(String[] args) {
        Date today = new Date();
        System.out.printf("오늘은 %s입니다.\n", today);

        SimpleDateFormat format1 = new SimpleDateFormat("YYYY년 MM월 dd일 E HH시 mm분 ss초");
        SimpleDateFormat format2 = new SimpleDateFormat("YYYY년 MM월 dd일 EEEEE a hh시 mm분 ss초");
        SimpleDateFormat format3 = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm:ss", new Locale("en", "US"));
        SimpleDateFormat format4 = new SimpleDateFormat("E dd MMMMM yyyy HH:mm:ss", Locale.ENGLISH);
        
        System.out.println(format1.format(today));
        System.out.println(format2.format(today));
        
        System.out.println("\nLocale 정보를 활용");
        System.out.println(format3.format(today) + " - new Locale(\"en\", \"US\")");
        System.out.println(format4.format(today) + " - Locale.ENGLISH");
    }

}
