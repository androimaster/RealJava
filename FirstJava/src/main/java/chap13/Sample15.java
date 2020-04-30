package chap13;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Sample15 {
    public static void main(String[] args) {
        printInfo(ZoneId.systemDefault());
        printInfo(ZoneId.of("America/Los_Angeles"));
    }
    
    public static void printInfo(ZoneId zone) {
        System.out.println("\nZone Info : " + zone);
        LocalDateTime ldt = LocalDateTime.now(zone);
        System.out.printf("현재 일시 : %s\n",ldt);
        System.out.printf("현재 일자 : %s\n",ldt.toLocalDate());
        System.out.printf("현재 시간 : %s\n",ldt.toLocalTime());
        System.out.printf("10년 뒤 : %s\n", ldt.plusYears(10));
    }
}
