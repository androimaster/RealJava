package chap19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Sample15 {

    public static void main(String[] args)  {
        String path = "c:" + File.separator + "Temp"
                + File.separator + "test" + File.separator;
        byte[] bytes = new byte[1024];

        //압축할 파일 목록을 가져옵니다.
        String files[] = new File(path).list();
        
        try(FileOutputStream fos = new FileOutputStream(path + "test.zip");
            ZipOutputStream  zos = new ZipOutputStream(fos)) {
            Arrays.stream(files)
                  .forEach(x -> {System.out.println(path + x);
                      File f = new File(path + x);
                      // zip 파일의 output Stream
                      try(FileInputStream fis      = new FileInputStream(f)) {
                          ZipEntry        zipEntry = new ZipEntry(f.getName());
                          
                          // 압출할 파일 추가
                          zos.putNextEntry(zipEntry);
                          
                          // 전달받은 파일을 압축하여 파일에 씀
                          int length;
                          while((length = fis.read(bytes)) >= 0) {
                              zos.write(bytes, 0, length);
                          }
                      } catch (Exception e) {
                          System.out.println(e.getMessage());
                      }
                  });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
