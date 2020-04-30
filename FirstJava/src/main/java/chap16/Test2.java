package chap16;

public class Test2 {

    public static void main(String[] args) {
        TestFunction tf = new TestFunction() {
            @Override
            public String apply(String str) {
                return str.replaceAll("-", "");
            }
        };

        String str = "010-0010-0100";
        System.out.println(tf.apply(str));
    }

}

@FunctionalInterface
interface TestFunction {
    public abstract String apply(String str);
}
