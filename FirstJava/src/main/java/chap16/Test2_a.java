package chap16;

public class Test2_a {

    public static void main(String[] args) {
        TestFunction tf = (str) -> str.replaceAll("-", "");
        
        String str = "010-0010-0100";
        System.out.println(tf.apply(str));
    }

}