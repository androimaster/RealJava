package chap13;

import java.util.Calendar;
import java.util.Date;

public class Sample01 {

    public static void main(String[] args) {
        //추상 클래스이므로 생성자를 사용하여 인스턴스를 생성할 수 없어서 static 메서드를 호출하여 생성
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        System.out.println(date);
    }
}
