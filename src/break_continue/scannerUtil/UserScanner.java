package break_continue.scannerUtil;

import java.util.Scanner;

public class UserScanner {
    private Scanner input;

    public void setInt() {
        System.out.print("입력하세요 : ");
        this.input = new Scanner(System.in);
    }

    public int getInt() {
        return input.nextInt();
    }
}
