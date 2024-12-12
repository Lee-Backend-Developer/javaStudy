package break_continue.calculator;

import break_continue.scannerUtil.UserScanner;

public class Calculator {

    final int input() {
        UserScanner userScanner = new UserScanner();
        userScanner.setInt();
        return userScanner.getInt();
    }


}
