package break_continue;

import break_continue.cafe.Menu;
import break_continue.calculator.PlusCal;
import break_continue.scannerUtil.UserScanner;

public class MainMethod {
    public static void main(String[] args) {

        UserScanner userScanner = new UserScanner();
        PlusCal plusCal = new PlusCal();
        Menu menu = new Menu();

        userScanner.setInt();
        switch (userScanner.getInt()) {
            case 1:
                System.out.println("계속 더 해지는 프로그램");
                plusCal.start();
                break;
            case 2:
                System.out.println("메뉴 고르는 프로그램");
                menu.start();
                break;
        }
    }
}
