package marketApplication;

import java.util.Scanner;

public class AdminUtils {
    public static Scanner input = new Scanner(System.in);

    public static void login(){
        System.out.println("You need to be logged in to access the admin panel.\n *******# Login #*******\n");
        System.out.print("Username: ");
        String username = input.next();
        System.out.print("Password: ");
        String password = input.next();
        boolean result = DatabaseOperations.getAdmins(username, password);
        if (result){
            AdminPanel.adminPanel();
        }else{
            System.out.println("Invalid username or password ");
            AdminUtils.makeAChoice();
        }
    }

    public static void makeAChoice(){
        System.out.println("\n1 - Return to Admin Panel\n2 - Return to HomePage \n3 Exit");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                AdminUtils.login();
                break;
            case 2:
                MainPage.marketApp();
                break;
            case 3:
                exit();
        }
    }


    public static void exit(){
        System.out.println("Exiting the system");
        System.exit(1);
    }










}
