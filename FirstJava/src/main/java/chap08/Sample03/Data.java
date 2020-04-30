package chap08.Sample03;

public class Data {

    int value;

    void setValue(int value) {
        value = value;  //매개변수 value을 멤버변수 value에 대입.. 하지만.. 매개변수에 매개변수를 대입
        //The assignment to variable value has no effect
    }

    int getValue() {
        return value;
    }

}
