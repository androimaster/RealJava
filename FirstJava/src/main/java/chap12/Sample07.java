package chap12;

import java.util.Scanner;

public class Sample07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" == 목적지 정보 ==");
		
		for(CITY city : CITY.values()) {
			System.out.printf("%d\t%s%n", city.getOrder(), city.getDestination());
		}
		
		System.out.print("목적지 번호를 선택하세요 ");		
		int selectNum = sc.nextInt();

		CITY retCity = CITY.valueOf(selectNum);
		if(retCity == null) {
			System.out.println("목적지를 확인하세요");
		}
		else {		
			switch (retCity) { 
				case SEOUL   -> System.out.printf("\n%s로 출발합니다", CITY.SEOUL.getDestination()); 
			    case DAEJEON -> System.out.printf("\n%s로 출발합니다", CITY.DAEJEON.getDestination()); 
			    case DAEGU   -> System.out.printf("\n%s로 출발합니다", CITY.DAEGU.getDestination()); 
			    case PUSAN   -> System.out.printf("\n%s로 출발합니다", CITY.PUSAN.getDestination()); 
			    case GWANGJU -> System.out.printf("\n%s로 출발합니다", CITY.GWANGJU.getDestination()); 
			    default      -> System.out.println("도착지를 다시 확인하세요.");
			}
		}
	}

}

enum CITY {
	SEOUL(0, "서울"), DAEJEON(1, "대전"), DAEGU(2, "대구"), PUSAN(3, "부산"), GWANGJU(4, "광주");
	
	private final int order;
	private final String destination;

	private CITY(int order, String destination) {
		this.order = order;
		this.destination = destination;
	}

	public int getOrder() {
		return order;
	}

	public String getDestination() {
		return destination;
	}
	
	
	/**
	 * 입력받은 index로 enum 요소 반환
	 * @param selectNum
	 * @return
	 */
	public static CITY valueOf(int selectNum) {
		CITY returnCity = null;
		for(CITY city : CITY.values()) {
			if(selectNum == city.getOrder()) {
				returnCity = city;
			}
		}
		return returnCity;
	}
}
