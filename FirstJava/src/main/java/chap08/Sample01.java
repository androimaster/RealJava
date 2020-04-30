package chap08;

public class Sample01 {

    /* 필드 영역 시작 */
    String name = "멤버변수";    //접근제어자가 생략된 멤버변수

    private int age;           //접근제어자가 있는 멤버변수

    //var age = 10;              //지역변수인 타입추론변수는 사용할 수 없음.
    /* 필드 영역 끝 */

    /* 메서드 영역 시작 */
    public void sayHello() {
        var friend = "친구야";  //메서드 내의 변수를 지역변하고 함.
        System.out.printf("%s 안녕?\n", friend);
    }

    public void sayHello(String friend) {
        System.out.printf("%s 안녕?\n", friend);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;     //필드와 매개변수가 동일할 때 this로 구분
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /* 메서드 영역 끝 */

    /* 생성자 영역 시작 */
    public Sample01(){
    }
    /* 생성자 영역 끝 */
}
