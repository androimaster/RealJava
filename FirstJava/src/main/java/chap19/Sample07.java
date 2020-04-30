package chap19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Sample07 {

    public static void main(String[] args) {
        
        try (FileInputStream      fis = new FileInputStream("java.exe");
             BufferedInputStream  bis = new BufferedInputStream(fis);
             FileOutputStream     fos = new FileOutputStream("test_java.exe");
             BufferedOutputStream bos = new BufferedOutputStream(fos)){
            int i;
            while((i = bis.read()) != -1) {
                bos.write(i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
        	System.out.println("파일 복사를 완료했습니다.");
        }
    }
}
