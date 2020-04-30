package chap19;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample12 {

    public static void main(String[] args) {
        String sPath = "c:" + File.separator + "My Java"
                     + File.separator + "Workspace" + File.separator 
                     + "RealJava2" + File.separator;

        //모든 파일과 디렉리 수집
        String files[] = new File(sPath).list();
        List<String> fileList = 
            Arrays.stream(files)
                  .map(x -> {
                       File fileDir = new File(x);
                       return (fileDir.isDirectory())?"디렉터리: " + x :"파일: " + x;
                  })
                  .collect(Collectors.toList());
        
        fileList.stream()
                .sorted()
                .forEach(System.out::println);
    }

}
