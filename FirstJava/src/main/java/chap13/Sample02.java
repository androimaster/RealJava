package chap13;

import java.util.Calendar;
import java.util.Date;

public class Sample02 {

    public static void main(String[] args) {
        //추상클래스이므로 생성자를 사용하여 인스턴스를 생성할 수 없어서 정적 메서드를 호출하여 생성
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        System.out.println("== Date Info ==");
        System.out.println(date);

        System.out.println("\n== Date ==");
        System.out.printf("%s %s %02d %02d:%02d:%02d KST %d\n"
            , getWeekName(date.getDay() + 1) //0부터 시작하기 때문에 1 더해줌
            , getMonthName(date.getMonth())
            , date.getDate()
            , date.getHours()
            , date.getMinutes()
            , date.getSeconds()
            ,date.getYear() + 1900
        );

        System.out.println("\n== Calendar ==");
        System.out.printf("%s %s %02d %02d:%02d:%02d KST %d"
            , getWeekName(cal.get(Calendar.DAY_OF_WEEK))
            , getMonthName(cal.get(Calendar.MONTH))
            , cal.get(Calendar.DAY_OF_MONTH)
            , cal.get(Calendar.HOUR_OF_DAY)
            , cal.get(Calendar.MINUTE)
            , cal.get(Calendar.SECOND)
            , cal.get(Calendar.YEAR)
        );
    }

    public static String getWeekName(int WeekNumber) {
        var returnVal = switch(WeekNumber) {
            case Calendar.SUNDAY    -> "Sun";
            case Calendar.MONDAY    -> "Mon";
            case Calendar.TUESDAY   -> "Tue";
            case Calendar.WEDNESDAY -> "Wed";
            case Calendar.THURSDAY  -> "Thu";
            case Calendar.FRIDAY    -> "Fri";
            case Calendar.SATURDAY  -> "Sat";
            default -> throw new IllegalArgumentException("Unexpected value: " + WeekNumber);
        };
        return returnVal;
    }

    public static String getMonthName(int MonthNumber) {
        var returnVal = switch(MonthNumber) {
            case Calendar.JANUARY   -> "Jan";
            case Calendar.FEBRUARY  -> "Feb";
            case Calendar.MARCH     -> "Mar";
            case Calendar.APRIL     -> "Apr";
            case Calendar.MAY       -> "May";
            case Calendar.JUNE      -> "Jun";
            case Calendar.JULY      -> "Jul";
            case Calendar.AUGUST    -> "Aug";
            case Calendar.SEPTEMBER -> "Sep";
            case Calendar.OCTOBER   -> "Oct";
            case Calendar.NOVEMBER  -> "Nov";
            case Calendar.DECEMBER  -> "Dec";
            default -> throw new IllegalArgumentException("Unexpected value: " + MonthNumber);
        };
        return returnVal;
    }
}
