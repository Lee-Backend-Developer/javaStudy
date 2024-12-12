package break_continue.cafe;

import break_continue.scannerUtil.UserScanner;

public class Menu {
    UserScanner input = new UserScanner();

    private void menuPrint(Cafe[] cafes) {
        for (Cafe cafeForeach : cafes) {
            System.out.println(cafeForeach.getCafeNo() + "번 " + cafeForeach.getCafeName());
        }
    }

    public void start() {
        Cafe[] cafe = {
                new Cafe("스타벅스"), new Cafe("빽다방"), new Cafe("컴포즈")
        };

        menuPrint(cafe);

        while(true) {
            input.setInt();
            if ((input.getInt() > 0) && (input.getInt() <= 3)) {
                switch (input.getInt()) {
                    case 1:
                        System.out.println(cafe[0].getCafeName());
                        break;
                    case 2:
                        System.out.println(cafe[1].getCafeName());

                        break;
                    case 3:
                        System.out.println(cafe[2].getCafeName());
                        break;
                }
                break;
            }
        }
    }
}
