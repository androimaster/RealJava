package chap08.Sample15;

public class Sample15 {

    public static void main(String[] args) {
        Student.Score score = new Student.Score("빵형"); 
        score.eng = 23;
        score.mat = 21;

        score.showInfo();
    }

}
