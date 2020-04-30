package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {

    public static void main(String[] args) {
        List<String> fileList = Arrays.asList("Sample01", "Sample02", "Sample03", "Sample04", "Sample05");
        List<String> newFileList = fileList.stream()
                                           .map(x -> x + ".java")
                                           .collect(Collectors.toList());
        System.out.println(newFileList);
    }

}
