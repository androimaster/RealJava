package chap06;

public class Sample03 {
    public static void main(String[] args) {
        String str = "Hello, JAVA";
        
        char[] chr = str.toCharArray();
        
        for(int idx = 0; idx < chr.length; idx++) {
            System.out.println(chr[idx]);
        }
    }
}
