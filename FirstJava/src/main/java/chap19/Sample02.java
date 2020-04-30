package chap19;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Sample02 {

    public static void main(String[] args) {
        try (FileInputStream  fis = new FileInputStream("pom.xml")
            ;FileOutputStream fos = new FileOutputStream("test_pom2.xml")){
            int i;
            while((i = fis.read()) != -1) {
                fos.write(i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
