package chap07;

public class Test3 {

    public static void main(String[] args) {
        //6개의 난수를 발생시킨다.
        int[] target = new int[6];
        for(int i = 0; i < target.length; i++) {
            target[i] = (int)(Math.random() * 45 + 1);
            if(i > 0) {
                //중복된 번호가 있는지 확인
                for(int j = 0; j < i; j++) {
                    if(target[i] == target[j]) {
                        i--;   //중복일 경우 배열번호를 이전으로 되돌려서 다시 번호를 선택하도록 처리
                        break;
                    }
                }
            }
        }

        //추첨번호 출력
        System.out.printf("%d %d %d %d %d %d", target[0], target[1], target[2], target[3], target[4], target[5]);
    }

}
