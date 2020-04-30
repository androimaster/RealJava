package chap12;

public class Test1 {
    public static void main(String[] args) {
        Days toDay = Days.SUNDAY;

        switch(toDay) {
            case SUNDAY    -> System.out.println("오늘은 일요일입니다.");
            case MONDAY    -> System.out.println("오늘은 월요일입니다.");
            case TUESDAY   -> System.out.println("오늘은 화요일입니다.");
            case WEDNESDAY -> System.out.println("오늘은 수요일입니다.");
            case THURSDAY  -> System.out.println("오늘은 목요일입니다.");
            case FRIDAY    -> System.out.println("오늘은 금요일입니다.");
            case SATURDAY  -> System.out.println("오늘은 토요일입니다.");
            default -> throw new IllegalArgumentException("Unexpected value: " + toDay); 
        }
    }
}

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
