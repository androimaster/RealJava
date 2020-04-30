package chap10;

public class Sample13 {

    public static void main(String[] args) {
        NumberBox nb = new NumberBox();
        nb.setNumber(20002);
        nb.setNumber(43567.1);
        //nb.setNumber("11234"); //오류발생
    }

}

class NumberBox {
    public <E extends Number> void setNumber(E e) { 
        System.out.printf("입력된 값은 [%s] 입니다. %n", e.toString());
    }
}
