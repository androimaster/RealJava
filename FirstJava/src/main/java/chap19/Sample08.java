package chap19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Sample08 {

    public static void main(String[] args) {
        try (BufferedInputStream  fis = new BufferedInputStream(new FileInputStream("java.exe"))
            ;BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("test_java.exe"))){
            int i;
            while((i = fis.read()) != -1) {
                fos.write(i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("파일 복사를 완료했습니다.");
        }
    }
    
}
