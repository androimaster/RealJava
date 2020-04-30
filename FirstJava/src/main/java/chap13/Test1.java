package chap13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        System.out.print("처음 만난 날을 입력하세요(예: 20200101) : ");
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuuMMdd");
        LocalDate date = LocalDate.parse(sc.next(), formatter);
        System.out.printf("100일 - %s\n", date.plusDays(100));
        System.out.printf("200일 - %s\n", date.plusDays(200));
        System.out.printf("500일 - %s\n", date.plusDays(500));
        System.out.printf("1,000일 - %s\n", date.plusDays(1000));
    }

}
