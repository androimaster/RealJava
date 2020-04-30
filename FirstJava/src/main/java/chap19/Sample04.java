package chap19;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Sample04 {

    public static void main(String[] args) {
        try (FileInputStream  fis = new FileInputStream("hangul.txt")
            ;FileOutputStream fos = new FileOutputStream("hangul2.txt")){
            fos.write(fis.read());
            fos.write(fis.read());
            fos.write(fis.read());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
