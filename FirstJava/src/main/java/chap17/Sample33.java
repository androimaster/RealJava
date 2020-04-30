package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample33 {

    public static void main(String[] args) {
        //Sample24의 FreeBoard 이용
        List<FreeBoard> list = Arrays.asList(
                new FreeBoard(1, "가입인사", "안녕하세요"),
                new FreeBoard(2, "가입인사", "반갑습니다."),
                new FreeBoard(3, "질문있습니다.", "자바가요 잡히나요?")
        );
        long cnt1 = list.stream()
                        .collect(Collectors.counting());
        System.out.println(cnt1);
        
        long cnt2 = list.stream().count();
        System.out.println(cnt2);
    }

}
