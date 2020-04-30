package chap13;

import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Sample16 {

    public static void main(String[] args) {
        // 시스템 기본 시간
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println("*. 시스템 기본 시간                : " + ldt1);
        
        ZoneId seoulZone   = ZoneId.of("Asia/Seoul");
        ZoneId bangkokZone = ZoneId.of("Asia/Bangkok");
        ZoneId sydneyZone  = ZoneId.of("Australia/Sydney");
        
        LocalDateTime ldt2 = LocalDateTime.now(seoulZone);
        System.out.println("\n1. LocalDateTime 서울 : " + ldt2);
        LocalDateTime ldt3 = LocalDateTime.now(bangkokZone);
        System.out.println("2. LocalDateTime 방콕 : " + ldt3);
        LocalDateTime ldt4 = LocalDateTime.now(sydneyZone);
        System.out.println("3. LocalDateTime 시드니 : " + ldt4);
        
        ZonedDateTime zdt1 = ZonedDateTime.now(seoulZone);
        System.out.println("\n1. ZonedDateTime 서울   : " + zdt1);
        ZonedDateTime zdt2 = ZonedDateTime.now(bangkokZone);
        System.out.println("2. ZonedDateTime 방콕  : " + zdt2);
        ZonedDateTime zdt3 = ZonedDateTime.now(sydneyZone);
        System.out.println("3. ZonedDateTime 시드니 : " + zdt3);
        
        ZonedDateTime nationalLiberationDay = Year.of(1945)
                                                  .atMonth(8)
                                                  .atDay(15)
                                                  .atTime(10, 30)
                                                  .atZone(ZoneId.of("Asia/Seoul"));
        System.out.printf("\nnationalLiberationDay : %s\n", nationalLiberationDay);
        
        ZonedDateTime zdt4 = zdt1.plusHours(10).withZoneSameInstant(sydneyZone);
        System.out.println("\n서울 출발 : " + zdt1 + "\n10시간 후 호주에 도착 : " + zdt4); 
    }

}
