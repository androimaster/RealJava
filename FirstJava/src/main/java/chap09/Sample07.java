package chap09;

public class Sample07 {

    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.study();
        Person2 p2 = new Person2();
        p2.teach();
        Person3 p3 = new Person3();
        p3.study();
        p3.teach();
    }

}

interface Student {
    void study();
}

interface Teacher {
    void teach();
}

//학생
class Person1 implements Student{

    @Override
    public void study() {
        System.out.println("Person1이 공부한다");
    }

}

//선생님
class Person2 implements Teacher {

    @Override
    public void teach() {
        System.out.println("Person2가 가르친다");
    }

}

//학생, 선생님
class Person3 implements Student, Teacher {

    @Override
    public void teach() {
        System.out.println("Person3이 가르친다");
    }

    @Override
    public void study() {
        System.out.println("Person3이 공부한다");
    }

}
