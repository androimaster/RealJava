package chap15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample05 {
    public static void main(String[] args) {
        String url = "https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/lang/String.html";

        String regex = "\\w+.html";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
	}
}
