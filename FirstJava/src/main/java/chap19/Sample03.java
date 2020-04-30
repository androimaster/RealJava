package chap19;

import java.io.FileOutputStream;

public class Sample03 {

    public static void main(String[] args) {
        char J = 74;
        char a = 97;
        char v = 118;
        
        try (FileOutputStream fos = new FileOutputStream("java.file")){
            fos.write(J);
            fos.write(a);
            fos.write(v);
            fos.write(a); 
            fos.write(64); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
