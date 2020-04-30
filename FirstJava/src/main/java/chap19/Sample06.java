package chap19;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Sample06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요. : ");
        String name = sc.nextLine();
        name += "\n" + name;
        System.out.println(name);
        InputStream is = new ByteArrayInputStream(name.getBytes());

        try (FileOutputStream fw = new FileOutputStream("hangul4.txt")){
            int i;
            while((i = is.read()) > -1) {
                fw.write(i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

}
