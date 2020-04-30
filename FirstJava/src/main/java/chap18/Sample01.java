package chap18;

public class Sample01 {

    public static void main(String[] args) {
        int i = 1;
        try {
           int j = 1;
           System.out.println(i);  //출려 됨
        }
        catch (Exception e) {
            
        }
        System.out.println(j);     //오류발생
    }
}
