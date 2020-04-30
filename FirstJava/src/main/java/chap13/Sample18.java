package chap13;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Sample18 {
    public static void main(String[] args) {
        ZonedDateTime yesterday = ZonedDateTime.now().minusHours(25); //24 + 1
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL).format(yesterday));
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG).format(yesterday));
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(yesterday));
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(yesterday));
        System.out.println();
        
        LocalDate today = LocalDate.now();
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(today));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(today));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(today));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(today));
        System.out.println();
        
        ZonedDateTime tomarrow = ZonedDateTime.now().plusDays(1);
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(tomarrow));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(tomarrow));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(tomarrow));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(tomarrow));
    }
}
