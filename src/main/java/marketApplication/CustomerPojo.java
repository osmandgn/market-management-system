package marketApplication;

public class CustomerPojo {
    private String customerFirstName;
    private String customerLastName;
    private String userName;
    private String mailAdress;
    private static int customer_id = 0001;
    private String password;


    public CustomerPojo(String customerFirstName, String customerLastName, String userName, String mailAdress ,String password){
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.userName = userName;
        this.password = password;
        this.mailAdress = mailAdress;
        customer_id++;
    }


    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMailAdress() {
        return mailAdress;
    }

    public void setMailAdress(String mailAdress) {
        this.mailAdress = mailAdress;
    }

    public static int getCustomer_id() {
        return customer_id;
    }

    public static void setCustomer_id(int customer_id) {
        CustomerPojo.customer_id = customer_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
