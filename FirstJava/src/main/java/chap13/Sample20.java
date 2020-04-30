package chap13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sample20 {
    public static void main(String[] args) {
        //기본 parse 패턴
        LocalDate date = LocalDate.parse("2020-01-01");
        System.out.println(date);

        //사용자 정의 패턴 #1
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("uuuuMMdd");
        String inDate1 = "20201010";
        LocalDate date1 = LocalDate.parse(inDate1, dateTimeFormatter1);
        System.out.println(date1);

        //사용자 정의 패턴 #2
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("uuuuMMdd HH:mm");
        String inDate2 = "20200505 14:15";
        LocalDateTime date2 = LocalDateTime.parse(inDate2, dateTimeFormatter2);
        System.out.println(date2);
    }
}
