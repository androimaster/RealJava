package chap16;

public class Sample29 {  
    public static void main(String[] args) {
        //인자없는 생성자
        HelloYourName1 yourName1 = Hello::new;
        System.out.println(yourName1.get().getName());

        //인자있는 생성자
        HelloYourName2 yourName2 = Hello::new;
        System.out.println(yourName2.get("Cheol-Su").getName());
    }  
}

interface HelloYourName1{
    Hello get();
} 

interface HelloYourName2{
    Hello get(String name);
}  

class Hello {
    private String name;

    public Hello() { 
        this.name = "Young-Hee";
        System.out.println("인자없는 생성자 호출");
    }

    public Hello(String name){
        System.out.println("인자있는 생성자 호출");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}  