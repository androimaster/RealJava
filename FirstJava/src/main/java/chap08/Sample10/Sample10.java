package chap08.Sample10;

public class Sample10 {

    public static void main(String[] args) {
        Student student = new Student("빵형");
        Student.Score studentScore = student.new Score();
        studentScore.eng = 23;
        studentScore.mat = 21;

        studentScore.showInfo();
    }

}
