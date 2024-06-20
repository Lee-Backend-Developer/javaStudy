package generic;

public class MyClass <T> {  // 제네릭 클래스 MyClass, 타입 매개변수 T
    T val;  // 변수 val의 타입은 T
    void set(T a) {
        val = a;    // T 타입의 값 a를 v에 지정
    }
    T get() {
        return val; // T 타입의 값 val 리턴
    }
}
