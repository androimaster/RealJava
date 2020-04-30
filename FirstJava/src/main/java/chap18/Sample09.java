package chap18;

public class Sample09 {

    public static void main(String[] args) {
        try {
            throw new UnsupportedOperationException("throw로 오류를 강제로 발생시켰습니다.");
        }
        catch(UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    
    }

}
