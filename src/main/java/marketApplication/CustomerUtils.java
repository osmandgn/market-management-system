package marketApplication;

import java.util.Scanner;

public class CustomerUtils {
    public static Scanner input = new Scanner(System.in);

    public static void login(){
        System.out.println("*******# Login #*******\n");
        System.out.print("Username: ");
        String username = input.next();
        System.out.print("Password: ");
        String password = input.next();
        boolean result = DatabaseOperations.customerLogin(username, password);
        if (result){
            CustomerPage.customerPage();
        }else{
            System.out.println("Invalid username or password ");
            makeAChoice();
        }
    }

    public static void register(){
        try {
            System.out.println("*".repeat(10) + "Register" + "*".repeat(10));
            System.out.println("FirstName: ");
            String fName = input.next();
            System.out.println("SurName: ");
            String sName = input.next();
            System.out.println("Mail Adress: ");
            String mail = input.next();
            System.out.println("Username: ");
            String userName = input.next();
            System.out.println("Password: ");
            String psw = input.next();
            Customer customer = new Customer(fName, sName, mail, userName, psw);
            DatabaseOperations.customerRegisteration(customer);
        }catch (Exception e){
            System.out.println("An error occurred");
            makeAChoice();
        }

    }


    public static void makeAChoice(){
        System.out.println("\n1 - Return to Customer Panel\n2 - Return to HomePage \n3 Exit");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                CustomerPanel.customerPanel();
                break;
            case 2:
                MainPage.marketApp();
                break;
            case 3:
                AdminUtils.exit();
        }
    }


}
