package chap19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Sample16 {

    public static void main(String[] args)  {
        String path = "c:" + File.separator + "Temp"
                + File.separator + "test" + File.separator;
        String files[] = new File(path).list();
        System.out.println(Arrays.toString(files));
        Arrays.stream(files)
              .filter(x -> {
                   String[] ext = x.split("\\.");
                   if(ext.length ==2 && "zip".equals(ext[1])) {
                       return true;
                   }
                   return false;
               })
              .forEach(x -> {
                   File zipPath = new File(path + x.split("\\.")[0]);
                   zipPath.mkdir();
                   try(ZipInputStream zis = new ZipInputStream(new FileInputStream(path + x))) {
                       ZipEntry zipentry = null;
                       while((zipentry = zis.getNextEntry()) != null) {
                           // 압축 파일 요소 경로
                           String entryFile = path + x.split("\\.")[0] + File.separator + zipentry.getName();
                           try(FileOutputStream fos = new FileOutputStream(entryFile)) {
                               byte[] bytes = new byte[1024];
                               int length;
                               while((length = zis.read(bytes)) != -1) {
                                   fos.write(bytes, 0, length);
                               }
                           }
                       }
                   }
                   catch(Exception e) {
                       System.out.println(e.getMessage());
                   }
               });
    }

}
