package chap07;

public class Test5 {

    public static void main(String[] args) {
        String word = "Internet of things";
        String result = "";

        //1. 모두 소문자로 바꾼다
        word = word.toLowerCase();

        //2. chatAt으로 공백인지 확인한다
        boolean changeFlag = false;
        for(var c : word.toCharArray()) {
            //3. 공백이면 제거하고 다음 문자를 대문자로 바꾼다.
            if(changeFlag) {
                changeFlag = false;
                c = (char)((int)c-32);
            }
            if(c == ' ') {
                changeFlag = true;
                continue;
            }
            result += c;

        } //4. 반복한다.

        System.out.println("input : " + word);
        System.out.println("ouput : " + result); 
    }

}
