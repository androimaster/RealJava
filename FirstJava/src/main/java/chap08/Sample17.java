package chap08;

public class Sample17 {

    public static void main(String[] args) {
        Student st = new Student("빵형", 21, 1);
        System.out.println(st.toString());
    }

}

class Student {
    String name;    //이름
    int     age;    //나이
    int   grade;    //학년

    public Student(String name, int age, int grade) {
        this.name  = name;
        this.age   = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
    }

}
