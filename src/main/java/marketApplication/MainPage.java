package marketApplication;

import java.util.Scanner;

public class MainPage {

    public static void marketApp(){
        System.out.println(" - ".repeat(10) + " Welcome to Market Management System " + " - ".repeat(10) +
                "\n1 - Admin Panel" +
                "\n2 - Custormer Panel" +
                "\n3 - Exit\n");
        Scanner input = new Scanner(System.in);
        String choice;
        do {
             choice = input.next();
             switch (choice){
                 case "1":
                     AdminUtils.login();
                     break;
                 case "2":
                     CustomerPanel.customerPanel();
                     break;
                 case "3":
                     AdminUtils.exit();
                     break;
                 default:
                     System.out.println("Invalid Choice");
             }

        }while (true);

    }





}
