package chap13;

import java.time.LocalDate;

public class Sample12 {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();  //현재 일자를 반환합니다.
        System.out.println(date1);

        LocalDate date2 = LocalDate.parse("1945-08-15");
        System.out.println(date2);

        System.out.printf("2020년은 %s입니다.\n",(date1.isLeapYear() ? "윤년" : "평년"));
        System.out.printf("1945년은 %s입니다.\n",(date2.isLeapYear() ? "윤년" : "평년"));

        System.out.printf("%s 에서 오늘은 %d일 입니다.\n", date1, date1.getDayOfMonth());
        System.out.printf("%s 에서 오늘은 %s 입니다.\n", date1, date1.getDayOfWeek());
        System.out.printf("%s 에서 오늘은 %s 입니다.\n", date1, date1.getMonth());
        System.out.printf("%s 에서 오늘은 %s월 입니다.\n", date1, date1.getMonthValue());
        System.out.printf("%s 에서 오늘은 %s년 입니다.\n", date1, date1.getYear());
        System.out.printf("%s은 1945-01-01로 부터 총 %d일이 지났습니다.\n\n", date2, date2.getDayOfYear());

        System.out.printf("1년 전의 날짜는 %s\n", date1.minusYears(1).getYear());
        System.out.printf("6개월 전 날짜는 %s\n", date1.minusMonths(6));
        System.out.printf("3일 전 날짜는 %s\n", date1.minusDays(3));
        System.out.printf("3주 전의 날짜는 %s\n\n", date1.minusWeeks(3));

        System.out.printf("1년 후의 날짜는 %s\n", date1.plusYears(1));
        System.out.printf("6개월 후의 날짜는 %s\n", date1.plusMonths(6));
        System.out.printf("3일 후의 날짜는 %s\n", date1.plusDays(3));
        System.out.printf("3주 후의 날짜는 %s \n", date1.minusWeeks(3));
    }

}
