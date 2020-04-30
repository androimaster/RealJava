package chap15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample04 {
    public static void main(String[] args) {
    	// .com으로 된 이메일을 배열로 찾으세요
        String target = "sample@sample.com,test@test.co.kr,example@example.com,"
                      + "school@school.net,apple@apple.org";
        
        String regex = "([\\w]*@[\\w]*(.com))";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(target);

        while(matcher.find()) {
        	System.out.println(matcher.group());
        }
	}
}
