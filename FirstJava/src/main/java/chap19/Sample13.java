package chap19;

import java.io.File;
import java.util.Arrays;

public class Sample13 {

    public static void main(String[] args) {
        String sPath = "c:" + File.separator + "My Java"
                     + File.separator + "Workspace" + File.separator 
                     + "RealJava2" + File.separator;

        //모든 파일과 디렉토리 수집
        String files[] = new File(sPath).list();
        Arrays.stream(files)
              .filter(x -> new File(x).isFile())
              .filter(x -> x.startsWith("hangul"))
              .map(x -> {
                  new File(x).delete();
                  return x;
               })
              .forEach(x -> System.out.println("파일 [" + x + "]이 삭제되었습니다."));
    }

}
