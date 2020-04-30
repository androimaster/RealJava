package chap04;

public class Sample07 {

	public static void main(String[] args) {
		System.out.println("* 논리곱 &");
		System.out.println( 1 == 1 && 2 == 3); //하나만 맞을 경우
		System.out.println( 1 > 2  && 4 < 2);  //둘 다 틀릴 경우
		System.out.println( 1 < 2  && 4 > 2);  //둘 다 맞을 경우
		
		System.out.println("* 논리합 |");
		System.out.println( 1 == 1 || 2 == 3); //하나만 맞을 경우
		System.out.println( 1 > 2  || 4 < 2);  //둘 다 틀릴 경우
		System.out.println( 1 < 2  || 4 > 2);  //둘 다 맞을 경우
		
		System.out.println("* 배타적 논리합 ^");
		System.out.println( 1 == 1 ^ 2 == 3); //하나만 맞을 경우
		System.out.println( 1 > 2  ^ 4 < 2);  //둘 다 틀릴 경우
		System.out.println( 1 < 2  ^ 4 > 2);  //둘 다 맞을 경우

		System.out.println("* 논리부정 !");
		System.out.println( !(1 == 1) );      //참일 경우의 부정
		System.out.println( !(1 < 1) );      //거짓일 경우의 부정
	}

}
