package chap06;

public class Test3 {
    public static void main(String[] args) {
        final int line = 5;  // 라인 수
        
        for(int i = 0; i < line; i++) {
            //공백 출력
            for(int j = 0; j < line-(i+1); j++) {
            	System.out.print(" ");
            }
            
            //별 출력
            for(int k = 0; k < (i+(i+1)); k++) {
            	System.out.print("*");
            }
            
            //행 개행
            System.out.println();
        }
    }
}