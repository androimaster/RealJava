package chap19;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import lombok.Getter;
import lombok.Setter;

public class Test1 {
    @Getter
    @Setter
    static String str = "";
    
    public static void main(String[] args) {;
        // 1. 구구단 파일 만들기
        IntStream.rangeClosed(2, 9)
                 .forEach(x -> {
                     IntStream.rangeClosed(2, 9)
                              .forEach(y -> {
                                   setStr(getStr() + x + " * " + y + " = " + (x * y) + "\n");
                               });
                     //파일로 만들기
                     System.out.print(getStr());
                     InputStream is = new ByteArrayInputStream(getStr().getBytes());
                     
                     try (FileOutputStream fw = new FileOutputStream(x + ".txt")){
                         int i;
                         while((i = is.read()) > -1) {
                             fw.write(i);
                         }
                     } catch (Exception e) {
                         System.out.println(e.getMessage());
                     }
                     finally {
                         File f = new File(x + ".txt");
                         f.deleteOnExit();
                         setStr(""); //str 초기화
                     }
                  });
        
        // 2. 압축하기
        try(FileOutputStream fos = new FileOutputStream("9x9.zip");
                ZipOutputStream  zos = new ZipOutputStream(fos)) {
                IntStream.rangeClosed(2, 9)
                      .forEach(x -> {
                          byte[] bytes = new byte[1024];
                          File f = new File(x + ".txt");
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
