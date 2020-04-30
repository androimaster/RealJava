package chap04;

public class Sample16 {

	public static void main(String[] args) {
		// 3항 연산자
		// (조건식) ? A : B
		int number = 7;
		String result = ((number % 2) == 0) ?  "even" : "odd";
		System.out.printf("%s number", result);
	}

}
