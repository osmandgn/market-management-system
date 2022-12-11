package marketApplication;

import java.util.Scanner;

public class MainPage {

    public static void marketApp(){
        System.out.println(" - ".repeat(10) + " Welcome to Market Management System " + " - ".repeat(10) +
                "\n1 - Admin Panel" +
                "\n2 - Custormer Panel" +
                "\n3 - Exit\n");
        Scanner input = new Scanner(System.in);
        int choice;
        do {
             choice = input.nextInt();
             switch (choice){
                 case 1:
                     //Admin Panel
                     break;
                 case 2:
                     // Customer Panel
                     break;
             }



        }while (choice != 3);

    }


}
