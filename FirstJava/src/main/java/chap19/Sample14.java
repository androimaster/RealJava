package chap19;

import java.io.File;
import java.io.IOException;

public class Sample14 {

    public static void main(String[] args) {
        String path = "c:" + File.separator + "Temp"
                     + File.separator + "test" + File.separator ;
        String file = "test.txt";

        // 경로가 없으면 생성
        File p = new File(path);
        if(!p.exists()) {
            p.mkdirs();
        }
        
        // 파일 생성
        File f = new File(path + file);
        try {
            System.out.println("파일을 생성합니다." + f.getCanonicalPath());
            f.createNewFile();
            System.out.println(f.exists());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
