package chap15;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("한글로만 이름을 입력하세요 : ");
		while(sc.hasNext()) {
		 	String name = sc.next();
		 	if("0".equals(name)) {
		 		System.out.println("종료합니다.");
		 		return;
		 	}
		 	Pattern pattern = Pattern.compile("^[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]*$");
		 	Matcher matcher = pattern.matcher(name);
		 	if(matcher.find()) {
		 		System.out.println("모두 한글입니다.");
		 	}
		 	else {
		 		System.out.println("한글로만 입력해주세요");
		 	}
			System.out.print("한글로만 이름을 입력하세요 : ");		 	
		}

	}

}
