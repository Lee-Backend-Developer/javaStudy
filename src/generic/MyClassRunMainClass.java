package generic;

public class MyClassRunMainClass {
    public static void main(String[] args) {
        MyClass<String> s = new MyClass<>();
        s.set("hello");
        System.out.println(s.get());
    }
}
