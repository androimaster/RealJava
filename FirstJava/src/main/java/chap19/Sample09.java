package chap19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Sample09 {

    public static void main(String[] args) throws Exception {
        URL url = new URL(
        "https://ssl.pstatic.net/tveta/libs/1278/1278934/1ba258a1ede217674ac7_20200323141347639.png");
        InputStream in = new BufferedInputStream(url.openStream());
        OutputStream out = new BufferedOutputStream(
            new FileOutputStream("1ba258a1ede217674ac7_20200323141347639.png"));
        for ( int i; (i = in.read()) != -1; ) {
            out.write(i);
        }
        
        in.close();
        out.close();
    }
    
}
