package chap10;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        CustomList<String> CustomList = new CustomList<>();
        CustomList.add("Iron man");
        CustomList.add("Captain America");
        CustomList.add("Thor");
        System.out.println(CustomList.toString());

        CustomList<Integer> numberlist = new CustomList<>();
        numberlist.add(1);
        numberlist.add(2);
        System.out.println(numberlist.toString());
    }
}

class CustomList<E> {
    private int listCount = 0;

    Object[] customList = new Object[0];

    public boolean add(E e) {
        listCount++;
        customList = Arrays.copyOf(customList, listCount);
        customList[listCount-1] = e;
        return true;
    }

    @Override
    public String toString() {
        return "CustomList =" + Arrays.toString(customList);
    }
}
