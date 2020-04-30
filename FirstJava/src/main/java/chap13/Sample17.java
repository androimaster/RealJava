package chap13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Sample17 {
	
    public static void main(String[] args) {
        System.out.println("BASIC_ISO_DATE - "
            + DateTimeFormatter.BASIC_ISO_DATE.format(LocalDate.of(2020, 5, 5)));
        System.out.println("ISO_DATE - "
            + DateTimeFormatter.ISO_DATE.format(LocalDate.of(2020, 5, 5)));
        System.out.println("ISO_LOCAL_DATE - "
            + DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.of(2020, 5, 5)));
        System.out.println("ISO_DATE_TIME - "
            + DateTimeFormatter.ISO_DATE_TIME.format(LocalDateTime.of(2020, 5, 5, 10,5,12)));
        System.out.println("ISO_LOCAL_DATE_TIME - "
            + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.of(2020, 5, 5, 10,5,12)));
        System.out.println("ISO_TIME - "
            + DateTimeFormatter.ISO_TIME.format(LocalTime.of(10,5,12)));
    }

}
