package chap07;

public class Sample10 {

    public static void main(String[] args) {
        int in = 6;  //입력 월

        String season = switch(in) {
            case 12, 1, 2  : break "겨울";
            case 3, 4, 5   : break "봄";
            case 6, 7, 8   : break "여름";
            case 9, 10, 11 : break "가을";
            default        : break "기후온난화";
        };

        System.out.println(season);
    }
}
