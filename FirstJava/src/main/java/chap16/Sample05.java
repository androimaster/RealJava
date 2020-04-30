package chap16;

public class Sample05 {

    public static void main(String[] args) {
    	    Sample05Function r = (t) -> {
            String result = "";
            for(int i = 0; i < t; i++) {
    	            result += "만세\n";
    	        }
    	        return result;
    	    };

    	    System.out.println("== 만세삼창 ==");
        System.out.println(r.test(3));
    }

}

@FunctionalInterface
interface Sample05Function {
    public abstract String test(int times);
}
