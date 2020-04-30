package chap08;

interface Greeting {
    public String sayHello(String name);
}

public class Sample13 {

    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public String sayHello(String name) {
                return name + " 안녕!";
            }
        };

        System.out.println( greeting.sayHello("빵형") );
    }

}
