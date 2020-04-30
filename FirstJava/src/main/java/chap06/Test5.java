package chap06;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단어를 입력하세요 : ");
        String word = sc.next();
        String passworld1 = ""; //암호화 할 변수
        String passworld2 = ""; //복호화 할 변수
        for(char c : word.toCharArray()) {
           passworld1 += "" + (char) (c-3);
        }
        System.out.printf("암호화 된 단어 : %s", passworld1);
        for(char c : passworld1.toCharArray()) {
            passworld2 += "" + (char) (c+3);
        }
        System.out.printf("\n복호화 된 단어 : %s\n", passworld2);
    }
}