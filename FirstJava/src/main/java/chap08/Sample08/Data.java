package chap08.Sample08;

public class Data {
    String name;
    int    age;  
	
    public Data() {
        System.out.println("Data 초기화합니다");
        this.name = "빵형";
        this.age  = 21;
    }
	
    /**
     * 생성자는 1개 이상 만들 수 있습니다.
     * @param name
     * @param age
     */
    public Data(String name, int age) {
        System.out.println("Data 초기화합니다");
        this.name = name;
        this.age  = age;
    }

    /**
     * 초기화된 내용을 출력하기 위한 메서드
     */
    public String toString() {
        return "Data [name=" + name + ", age=" + age + "]";
    }
	
}
