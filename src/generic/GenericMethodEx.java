package generic;

public class GenericMethodEx {
    static <T> void toStack(T[] a, GStack<T> gs){
        for (int i = 0; i < a.length; i++) {
            gs.push(a[i]);
        }
    }
}
