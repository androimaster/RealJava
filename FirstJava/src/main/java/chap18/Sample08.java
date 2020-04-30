package chap18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample08 {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    
    }
    
    static String readFirstLineFromFileWithFinallyBlock(String path)  {
    	BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            return br.readLine();
        } catch (IOException e) {
			e.printStackTrace();
		} finally {
            if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        }
        return "";
    }
}
