package chap15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample08 {

    public static void main(String[] args) {
        String no = "주민등록 번호 : 010101-2345879 "
                  + "주민등록 번호 : 020202-4567890";
        String regex = "[0-9]{6}-[0-9]{7}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(no);

        while(matcher.find()) {
            System.out.print(matcher.group() + " -> ");
            String newNo = matcher.group().substring(0, 7)
                         + "****"
                         + matcher.group().substring(11);
            System.out.println(newNo);
        }
    }

}
