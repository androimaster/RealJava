package chap05;

public class Sample04 {
    public static void main(String[] args) {
        String[] str1 = new String[3];
        str1[0] = "자바";
        str1[1] = "코틀린";
        str1[2] = "씨";
        System.out.printf("str1 배열의 개수는 %d개 입니다.", str1.length);
		
        String[] str2 = {"자바", "코틀린", "씨"};
        System.out.printf("\n\nstr2 배열의 개수는 %d개 입니다.\n\n", str2.length);
		
        String[] str3 = str2.clone();
        System.out.println(str3[0]);
        System.out.println(str3[1]);
        System.out.println(str3[2]);
    }
}
