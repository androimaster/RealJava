package chap10;

public class Sample12 {

    public static void main(String[] args) {
        Data data = new Data();
        data.setValue(true);
        System.out.println(data.getValue());
    }

}

class Data {
    String value;
    public <T> void setValue(T t) {
        this.value = t.toString();
    }

    public String getValue() {
        return this.value;
    }
}
