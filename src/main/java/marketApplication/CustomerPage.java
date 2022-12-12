package marketApplication;

import java.util.Scanner;

import static marketApplication.Shopping.*;

public class CustomerPage {

    public static void customerPage(){
        System.out.println("********# Login Successful #********\n1 - Show Products\n2 - Buy Something\n3 - Shopping Cart\n4 - Payment\n5 - HomePage\n0 - Exit");
        Scanner input = new Scanner(System.in);
        String choice = input.next();

        switch (choice){
            case "1":
                DatabaseOperations.showCustomerProducts();
                break;
            case "2":
                buySomething();
                break;
            case "3":
                shoppingCart();
                break;
            case "4":
                makeAPaymetn();
                break;
            case "5":
                MainPage.marketApp();
                break;
            case "6":
                AdminUtils.exit();
                break;
            default:
                System.out.println("Invalid Selection");
                CustomerUtils.makeAChoice();

        }


    }



}
