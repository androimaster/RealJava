package chap08.Sample10;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public class Score {
        int eng;
        int mat;

        public void showInfo() {
            System.out.println("이름 : " + name);  //외부클래스의 자원에 쉽게 접근합니다.
            System.out.println("영어 : " + eng);
            System.out.println("수학 : " + mat);
        }
    }

}
