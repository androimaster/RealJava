package chap07;

public class Sample06 {

    public static void main(String[] args) {
        int in = 5;

        switch(in) {
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 9: 
                    System.out.println("홀수입니다.");
                    break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println(10);
                break;
            default:System.out.println("1부터 10까지의 수가 아닙니다.");
        }
    }
}
