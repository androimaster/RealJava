package chap02;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Sample18 {

	public static void main(String[] args) {
//		String _ = "underscore"; //'_' should not be used as an identifier, since it is a reserved keyword from source level 1.8 on
//		System.out.println(_);
//		test("underscore");
		Function<String, String> f = a -> a;
		Function<String, String> g = a_ -> a_;
		
		/*
		Internet of thing
		Text box
		find keyword
		
		//1. 카멜 표기법(Camel Case)
		 internetOfThing
		 textBox
		 findKeyword
		 
		//2. 파스칼 표기법(Pascal Case)
		 InternetOfThing
		 TextBox
		 FindKeyword
		 
		//3. 스네이크 표기법(Snake Case)
		 internet_of_thing
		 text_box
		 find_keyword
		 
		//4. 케밥 표기법(Kebab Case)
		 Internet-of-thing
		 Text-box
		 find-keyword
		*/
		int Internet = 10;
		int of = 1;
		int thing = 2;
		int a = Internet-of-thing;
		String string = "asdf";
		Map mapData = new HashMap();
	}
	/*
	public static void test(String _) {
		System.out.println(_);
	}*/
}
