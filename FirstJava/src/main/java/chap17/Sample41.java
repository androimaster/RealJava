package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample41 {

    public static void main(String[] args) {
        // 2개의 String 배열이 있습니다.
        String[] str1 = {"빵형", "상도", "타노스"};
        String[] str2 = {"인호", "학건"};
        
        // 2개의 String 배열을 스트림으로 만듭니다. 
        //[{"빵형", "상도", "타노스"}, {"인호", "학건"}]
        Stream<String[]> strm = Stream.of(str1, str2);
        
        List<String> list = 
            //{"빵형", "상도", "타노스", "인호", "학건"} 한개의 배열로 스트림 변환
            strm.flatMap(x -> Arrays.stream(x))
                .collect(Collectors.toList());  //List<String>으로 변환
        System.out.println(list.toString());
    }

}
