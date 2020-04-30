package chap11;

public class Test5 {

    public static void main(String[] args) {

        String result = "";
        int times = 10;  //반복 수

        for(int idx = 0; idx < times; idx++) {
            if("".equals(result)) {
                //시작은 1이다.
                result = "1";
            }
            else {
                char[] input = result.toCharArray(); //결과정보를 char 배열로 받음
                result = "";

                String target = "";
                for(int i = 0; i < input.length; i++) {
                    if("".equals(target)) {
                        //첫 문자 출력
                        target = "" + input[i];
                        result = result + target;
                    }
                    else if(target.charAt(0) == input[i]) {
                        //똑같은 문자가 들어왔을 때 append
                        target += "" + input[i];
                    }
                    else {
                        //새로운 문자가 왔을 때 - 갯수 append, 새로운 문자 append
                        result += ((target).length() + ("" + input[i]));
                        target = "" + input[i];
                    }

                    //마지막이거나 다음 값이 바뀌면 갯수 출력
                    if(i == (input.length - 1)) {
                        result += target.length();
                        target = "";
                    }	
                }
            } // if문 끝
            System.out.printf("%2d 회전 :: %s\n", (idx+1), result);
        } // for문 끝
    }
}
