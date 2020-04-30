package chap02;

public class Sample11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  in = sc.nextLine();
        System.out.printf("입력한 값 : [%s]\n글자 수 : %d\n", in.toUpperCase().trim()
                                                     , in.toUpperCase().trim().length());
        sc.close();
    }

}
