package chap19;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sample11 {

    public static void main(String[] args) {
        String sPath = "c:" + File.separator + "My Java"
                     + File.separator + "Workspace" + File.separator 
                     + "RealJava2" + File.separator;
        //대상 경로
        File paths = new File(sPath);
        //모든 파일과 디렉터리 수집
        String files[] = paths.list();
        List<String> fileList = new ArrayList<>();
        for(String fNm : files){
            File fileDir = new File(fNm);
            if(fileDir.isDirectory()) {
                //디렉터리일 경우
                fNm = "디렉터리: " + fNm;
            }
            else {
                //파일일 경우
                fNm = "파일: " + fNm;
            }
            fileList.add(fNm);
        }
        
        fileList.sort(Comparator.naturalOrder()); //순차정렬
        fileList.forEach(System.out::println);
    }

}
