package chap11;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample08 {
	
	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("dog");
		list.add("cat");
		list.add("lion");
		System.out.println(list);
		System.out.printf("총 %d의 자료가 있습니다.%n%n", list.size());
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) { // hasNext()를 통해서 요소가 있으면 반복문 실행
			String item = it.next();
			System.out.println(item);
			if("cat".equals(item)) {  //cat은 배열에서 제거
				it.remove();
			}
		}

		System.out.println("\n" + list);
		System.out.printf("총 %d의 자료가 있습니다.%n%n", list.size());
	}
}