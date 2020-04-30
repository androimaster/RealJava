package chap18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample07 {

    public static void main(String[] args) {
        String msg = "";
        List<String> list = new ArrayList<String>();
        try {
            list.add("사자");
            list.add("호랑이");
            list.add("원숭이");
            list = Collections.unmodifiableList(list);
            list.add("토끼");
            msg = "처리가 완료되었습니다.";
        }
        catch (UnsupportedOperationException e) {
            msg = "처리 중에 오류가 발생했습니다.";
        }
        finally {
            System.out.println(msg);
        }
    }

}
