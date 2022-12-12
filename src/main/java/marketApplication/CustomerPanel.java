package marketApplication;

import java.util.Scanner;

public class CustomerPanel {
    public static void customerPanel() {
        Scanner input = new Scanner(System.in);
        System.out.println("".repeat(25) + "Welcome to DGN Market" + "".repeat(25));
        System.out.println("\n1 - Login \n2 - Register \n3 - Return to Homepage \n4 - Exit");
        while (true) {
            String choice = input.next();
            switch (choice) {
                case "1":
                    CustomerUtils.login();
                case "2":
                    CustomerUtils.register();
                case "3":
                    MainPage.marketApp();
                case "4":
                    AdminUtils.exit();
                default:
                    System.out.println("Invalied Section ");
            }


        }
    }
}
