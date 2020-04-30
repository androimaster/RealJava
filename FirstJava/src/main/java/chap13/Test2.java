package chap13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test2 {

    public static void main(String[] args) {
        String date = "202505";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuuMMdd");
        LocalDate dt = LocalDate.parse(date + "01", formatter);
        int dtMonth = dt.getMonthValue();
        int weekCnt = 0;
        int[][] days = new int[6][7]; //6주 7일
        int day = 1;
        int weekNum = dt.getDayOfWeek().getValue(); //1일의 요일
        do {
            days[weekCnt][weekNum] = dt.getDayOfMonth();
            if(weekNum == 6) {
                weekCnt++;
                weekNum = 0;
            }
            else {
                weekNum++;
            }
            dt = dt.plusDays(day);
        } while(dtMonth == dt.getMonthValue()); //달이 바뀌면 종료
        
        // 배열의 내용을 출력
        System.out.printf("\t%d년 %d월\n\n", dt.getYear(), dtMonth);
        System.out.println(" SUN MON TUE WEZ THU FRI SAT");
        for(int[] week : days) {
            for(int today : week) {
                System.out.printf("%4s", today == 0? "" : today);
            }
            System.out.println();
        }
    }

}
