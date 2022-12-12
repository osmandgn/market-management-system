package marketApplication;

import java.util.ArrayList;
import java.util.Scanner;

import static marketApplication.DatabaseOperations.getNameOfProduct;
import static marketApplication.DatabaseOperations.getPriceOfProduct;

public class Shopping {
    public static int sum;
    public static ArrayList<String> products;
    public static Scanner input = new Scanner(System.in);
    public static void buySomething(){
        while (true){
            System.out.println("Entry ID of Product You Want to Buy | 0 to Exit");
            int id = input.nextInt();
            if (id == 0){
                System.out.println("Total amount to paid is " + sum + "$");
                CustomerPage.customerPage();
            }
            sum += getPriceOfProduct(id);
            products.add(getNameOfProduct(id));
        }

    }


    public static void shoppingCart(){
        System.out.println("Products you bought: " + products);
        System.out.println("Total amount to paid is " + sum + "$");
    }

    public static void makeAPaymetn(){
        System.out.println("Make a Payment");
        int payment = input.nextInt();
        sum -= payment;
        System.out.println("Total amount to paid is " + sum + "$");

    }
}
