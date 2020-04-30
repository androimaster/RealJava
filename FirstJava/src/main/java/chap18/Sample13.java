package chap18;

import java.util.Arrays;
import java.util.List;

public class Sample13 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("인디안밥", "고래밥", "허니버터칩");
        try {
            hasBread(list);
        }
        catch(BreadException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static boolean hasBread(List<String> list) throws BreadException {
        if(!list.contains("빵")) {
            throw new BreadException();
        }
        return true;
    }

}

class BreadException extends Exception {

    public BreadException() {
        super("빵이 포함되지 않는 치명적인 오류가 발생했습니다.");
    }

}