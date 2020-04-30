package chap08;

interface Bow {
    public String sayHello();

    public String sayBye();
}

public class Sample14 {

    public static void main(String[] args) {
        String name = "빵형";
        Bow bow = new Bow() {
            @Override
            public String sayHello() {
                return name + " 안녕!";
            }

            @Override
            public String sayBye() {
                System.out.println(this.sayHello());
                return name + " 잘가!";
            }
        };

        System.out.println( bow.sayBye() );
    }

}
