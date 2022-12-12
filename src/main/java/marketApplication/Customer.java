package marketApplication;

public class Customer {
    private String customerFirstName;
    private String customerLastName;
    private String userName;
    private String mailAdress;
    private String password;


    public Customer(String customerFirstName, String customerLastName, String mailAdress, String userName, String password){
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.userName = userName;
        this.password = password;
        this.mailAdress = mailAdress;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
