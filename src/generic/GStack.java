package generic;

public class GStack<T> {    // 제네릭 스택 선언, 제니릭 타입 T
    int tos;
    Object [] stack;    // 스택에 요소를 저장할 공간 배열

    public GStack() {
        tos = 0;
        stack = new Object[10];
    }

    public void push(T item){
        if(tos == 10) // 스택이 꽉 차서 더 이상 요소를 삽입할 수 없음
            return;

        stack[tos] = item;
        tos++;
    }

    public T pop() {
        if(tos == 0)        // 스택이 비어 있어 꺼낼 요소가 없음
            return null;
        tos--;
        return (T) stack[tos]; //타입 매개변수 타입으로 캐스팅
    }
}

class MyStack{
    public static void main(String[] args) {
        GStack<String> stringStack = new GStack<>(); //String 타입의 GStack 생성

        stringStack.push("seoul");
        stringStack.push("busan");
        stringStack.push("LA");

        for (int i = 0; i < 3; i++) {
            System.out.println(stringStack.pop()); //stringStack 스택에 있는 3개의 문자열 팝
        }

        GStack<Integer> integerStack = new GStack<>();
        integerStack.push(1);
        integerStack.push(3);
        integerStack.push(5);

        for (int i = 0; i < 3; i++) {
            System.out.println(integerStack.pop());
        }
    }
}
