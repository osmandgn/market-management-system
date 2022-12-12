package marketApplication;
import java.sql.*;
import java.util.Scanner;

public class DatabaseOperations {
    private static Connection con;
    private static Statement st;
    private static Scanner input = new Scanner(System.in);



    public static Connection getConnection(){
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/osman", "postgres", "osman001");
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }

    public static Statement getStatement(){
        try {
            st = con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return st;
    }

    public static void addNewProduct(){


    }

    public static void deleteProduct(){

    }

    public static void updateDatabase(){
    }

    public static void executeQuery(){

    }

    public static void shortProducts(){

    }






}
