package chap05;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        var wishList = new String[] {
            "냉장고", "선풍기", "TV", "노트북", "세탁기", "에어컨"
        };

        var purchasedList = new String[] {
            "에어컨", "노트북", "TV"
        };

        System.out.println("== 구입하지 못한 물건 ==");
        Arrays.sort(purchasedList);  //이진 검색을 위해서 정렬

        System.out.printf("%s", Arrays.binarySearch(purchasedList, wishList[0]) < 0 ? wishList[0]+"\n" : "");
        System.out.printf("%s", Arrays.binarySearch(purchasedList, wishList[1]) < 0 ? wishList[1]+"\n" : "");
        System.out.printf("%s", Arrays.binarySearch(purchasedList, wishList[2]) < 0 ? wishList[2]+"\n" : "");
        System.out.printf("%s", Arrays.binarySearch(purchasedList, wishList[3]) < 0 ? wishList[3]+"\n" : "");
        System.out.printf("%s", Arrays.binarySearch(purchasedList, wishList[4]) < 0 ? wishList[4]+"\n" : "");
    }
}
