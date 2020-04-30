package chap08.Sample15;


class Student {
    static String name;    //정적 내부 클래스는 static 멤버 변수만 접근이 가능

    public Student(String name) {
        this.name = name;
    }

    public static class Score {
        int eng;
        int mat;

        public Score(String name) {
            Student.name = name;  //내부 클래스의 this는 내부 클래스를 참조하기 때문에 Student를 직접 참조
        }

        public void showInfo() {
            System.out.println("이름 : " + name);  //외부클래스의 자원에 쉽게 접근합니다.
            System.out.println("영어 : " + eng);
            System.out.println("수학 : " + mat);
        }
    }

}
