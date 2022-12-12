package marketApplication;

import java.util.Scanner;

public class AdminPanel {
    public static Scanner input = new Scanner(System.in);
    public static void adminPanel(){
        System.out.println("Welcom");
        while (true){
            System.out.println("\t\tWelcome to Admin Panel\t\t\n" + "*".repeat(50) + "\n1 - See the Products \n2 - Add New Product \n3 - Delete a Product \n4 - Update Price \n5 - Update Stock \n6 - Main Menu \n0 - Quit");
            String choice = input.next();
            switch (choice){
                case "1":
                    DatabaseOperations.showProducts();
                    break;
                case "2":
                    DatabaseOperations.addNewProduct();
                    break;
                case "3":
                    DatabaseOperations.deleteProduct();
                    break;
                case "4":
                    DatabaseOperations.updatePrice();
                    break;
                case "5":
                    DatabaseOperations.updateStock();
                    break;
                case "6":
                    MainPage.marketApp();
                    break;
                case "0":

            }
        }
    }
}
