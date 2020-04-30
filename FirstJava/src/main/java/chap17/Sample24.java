package chap17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Sample24 {

    public static void main(String[] args) {
        List<FreeBoard> list = Arrays.asList(
                new FreeBoard(1, "가입인사", "안녕하세요"),
                new FreeBoard(2, "가입인사", "반갑습니다."),
                new FreeBoard(3, "질문있습니다.", "자바가요 잡히나요?")
        );
        
        List<FreeBoard> reversedList = 
            list.stream()
                .collect(Collectors.collectingAndThen( Collectors.toList()
                                                     , contents -> {
                                                         Collections.reverse(contents);
                                                         return contents.stream();
                                                       }
                                                     )
                        )
                .collect(Collectors.toList());

        long cnt = list.stream()
                       .collect(Collectors.counting());

        reversedList.stream().forEach(System.out::println);
        System.out.println(cnt);
    }

}

@Data
@AllArgsConstructor
class FreeBoard {
    private int no;
    private String title;
    private String contents;
}
