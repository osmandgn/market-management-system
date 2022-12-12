package marketApplication;

import java.util.Scanner;

public class AdminLogin {

    public static void login(){
        Scanner input = new Scanner(System.in);
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
            //Menu
        }
    }

}
