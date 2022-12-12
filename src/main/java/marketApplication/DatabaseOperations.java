package marketApplication;

import java.sql.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DatabaseOperations {
    private static Connection con;
    private static Statement st;
    private static Scanner input = new Scanner(System.in);

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/osman", "postgres", "osman001");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static Statement getStatement() {
        try {
            st = con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return st;
    }


    public static void addNewProduct() {
        getConnection();
        getStatement();
        try {
            System.out.print("Product Name: ");
            String product_name = input.next();
            System.out.print("Category: ");
            String category = input.next();
            System.out.print("Price: ");
            double price = input.nextDouble();
            System.out.print("Stock: ");
            int stock = input.nextInt();
            String sql = "INSERT INTO products VALUES (default, '" + product_name + "', '" + category + "', " + price + ", " + stock + " )";
            st.execute(sql);
        } catch (InputMismatchException e) {
            System.out.println("Please input invalid information");
            input.nextLine();
            addNewProduct();
        } catch (SQLException e) {
            System.out.println("Database Connection Error ");
        }
        System.out.println("Product Added!");
        AdminUtils.makeAChoice();

    }

    public static void deleteProduct() {
        getConnection();
        getStatement();
        try {
            System.out.println("Enter the right name of the product you want to delete");
            String product_name = input.next();
            String sql = "Delete from products where product_name = '" + product_name + "'";
            st.execute(sql);
        } catch (SQLException e) {
            System.out.println("Database Connection Error ");
        }

        System.out.println("Product Deleted!");
        AdminUtils.makeAChoice();

    }

    public static void updatePrice() {
        getConnection();
        getStatement();
        try {
            System.out.println("Enter the product name you want to change the price");
            String product_name = input.next();
            System.out.println("Enter the new price");
            int newPrice = input.nextInt();
            String sql = "UPDATE products SET price = " + newPrice + " WHERE product_name = '" + product_name + "'";
            st.execute(sql);
        } catch (InputMismatchException e) {
            System.out.println("Please input valid information");
            input.nextLine();
            updatePrice();
        } catch (SQLException e) {
            System.out.println("Database Connection Error ");
        }
        System.out.println("Price of Product Updated");
        AdminUtils.makeAChoice();
    }

    public static void updateStock() {
        getConnection();
        getStatement();
        try {
            System.out.println("Enter the product name you want to change the stock");
            String product_name = input.next();
            System.out.println("Enter the new stock");
            int newStock = input.nextInt();
            String sql = "UPDATE products SET stock = " + newStock + " WHERE product_name = '" + product_name + "'";
            st.execute(sql);
        } catch (InputMismatchException e) {
            System.out.println("Please input valid information");
            input.nextLine();
            updateStock();
        } catch (SQLException e) {
            System.out.println("Database Connection Error ");
        }
        System.out.println("Stock of Product Updated");
    }

    public static void showProducts() {
        getConnection();
        getStatement();
        try {
            String sql = "SELECT * FROM products";
            ResultSet resultSet = st.executeQuery(sql);
            System.out.println("ID \t Name \t Category \t Price \t Stock ");
            System.out.println("*".repeat(50));
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t\t" +
                        resultSet.getString(3) + "\t\t" + resultSet.getInt(4) + "\t\t" + resultSet.getInt(5));
            }
        } catch (SQLException e) {
            System.out.println("Database Connection Error ");
        }
        AdminUtils.makeAChoice();
    }


    public static boolean getAdmins(String username, String password) {
        getConnection();
        getStatement();
        boolean result = false;
        try {
            String sql = "SELECT * FROM admins";
            ResultSet resultSet = st.executeQuery(sql);
            while (resultSet.next()) {
                String uName = resultSet.getString(1);
                String pswrd = resultSet.getString(2);
                if (username.equals(uName) && password.equals(pswrd)) {
                    result = true;
                }
            }
        } catch (SQLException e) {
            System.out.println("Database Connection Error ");
        }
        return result;
    }


    public static boolean customerLogin(String username, String password) {
        getConnection();
        getStatement();
        boolean result = false;
        try {
            String sql = "SELECT * FROM customers";
            ResultSet resultSet = st.executeQuery(sql);
            while (resultSet.next()) {
                String uName = resultSet.getString(5);
                String pswrd = resultSet.getString(6);
                if (username.equals(uName) && password.equals(pswrd)) {
                    result = true;
                }
            }
        } catch (SQLException e) {
            System.out.println("Database Connection Error ");
        }
        return result;
    }


    public static void customerRegisteration(String fName, String sName, String mail, String username, String password) {
        getConnection();
        getStatement();
        try {
            String sql = "INSERT INTO customers VALUES (default, '" + fName + "', '" + sName + "', '" + mail + "', '" + username + "', '" + password + "' )";
            st.execute(sql);
        } catch (InputMismatchException e) {
            System.out.println("Please input invalid information");
            input.nextLine();
            customerRegisteration(fName, sName, mail, username, password);
        } catch (SQLException e) {
            System.out.println("Database Connection Error ");
        }
        System.out.println("Registered");
        CustomerUtils.login();
    }


}
