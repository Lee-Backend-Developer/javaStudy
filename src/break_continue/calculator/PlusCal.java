package break_continue.calculator;

public class PlusCal extends Calculator {

    public void start() {
        int temp = 0;

        while(true) {
            temp += input();
            if (input() == 0) {
                break;
            }
        }
        System.out.println("temp = " + temp);
    }
}
