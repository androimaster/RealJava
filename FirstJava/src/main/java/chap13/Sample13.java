package chap13;

import java.time.LocalTime;
import java.time.ZoneId;

public class Sample13 {

    public static void main(String[] args) {
        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        System.out.printf("현재 시간은 %s\n",time1.getHour());
        System.out.printf("현재 분은 %s\n",time1.getMinute());
        System.out.printf("현재 초는 %s\n",time1.getSecond());

        LocalTime time2 = LocalTime.of(13,59,10);
        System.out.println(time2);  

        LocalTime time3 = LocalTime.now(ZoneId.of("Asia/Colombo")); //쓰리랑카의 콜롬보
        System.out.println(time3 + " - Asia/Colombo\n ");

        System.out.printf("1시간 전 [%s]\n",time2.minusHours(1));
        System.out.printf("12분 전 [%s]\n",time2.minusMinutes(12));
        System.out.printf("130초 전 [%s]\n\n",time2.minusSeconds(130));  // 00초는 생략이 됩니다.

        System.out.printf("1시간 후 [%s]\n",time2.plusHours(1));
        System.out.printf("12분 후 [%s]\n",time2.plusMinutes(12));
        System.out.printf("110초 후 [%s]\n",time2.plusSeconds(110));  // 00초는 생략이 됩니다.
    }

}
