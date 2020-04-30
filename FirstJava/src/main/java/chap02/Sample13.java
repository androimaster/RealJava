package chap02;

public class Sample13 {

    public static void main(String[] args) {
        // var name;       //자료형을 추론할 때 리터럴이 없으면 추론할 수 없어서 에러가 발생
        var name = "나어때";
        var age  = 28;
        var height = 183.7f;
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
    }

}
