package chap09;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {

    public static void main(String[] args) {
        Data asc = new AscData();
        asc.setData(1, 2, 6, 9, 4);
        asc.sort();
        System.out.println("오름차순 : " + asc.toString());
        Data des = new DesData();
        des.setData(1, 2, 6, 9, 4);
        des.sort();
        System.out.println("내림차순 : " + des.toString());
    }

}

abstract class Data {
    Integer[] data;

    public void setData(Integer... data) {
        this.data = data;
    }

    public abstract void sort();

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

}

class AscData extends Data {

    @Override
    public void sort() {
        //Ascending
        Arrays.sort(data);
    }

}

class DesData extends Data {

    @Override
    public void sort() {
        //Descending
        Arrays.sort(data, Comparator.reverseOrder());
    }

}
