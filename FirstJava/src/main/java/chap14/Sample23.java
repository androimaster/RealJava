package chap14;

public class Sample23<T> {
    
    //Potential heap pollution via varargs parameter toAdd
    @SafeVarargs
    public final void safe(T... toAdd) { }

    @SafeVarargs
    public static void safe(int... toAdd) { }

    @SafeVarargs
    private void safe2(T... toAdd) { }

}
