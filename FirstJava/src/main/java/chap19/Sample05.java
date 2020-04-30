package chap19;

import java.io.FileReader;
import java.io.FileWriter;

public class Sample05 {

    public static void main(String[] args) {
        try (FileReader fr = new FileReader("hangul.txt")
            ;FileWriter fw = new FileWriter("hangul3.txt")){
            fw.write(fr.read());
            fw.write(fr.read());
            fw.write(fr.read());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
