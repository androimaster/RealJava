package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample26 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("py", "java", "c");
        
        //단순 조합
        String a = list.stream()
                       .collect(Collectors.joining());
        System.out.println(a);

        //요소와 요소를 구분자로 구분
        String b = list.stream()
                       .collect(Collectors.joining(", "));
        System.out.println(b);

        //구분자, 접두사, 접미사
        String c = list.stream()
                       .collect(Collectors.joining(" ,", "프로그래밍 언어에는 "," 등 이 있습니다."));
        System.out.println(c);
    }

}
