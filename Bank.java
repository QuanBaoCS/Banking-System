
import java.util.ArrayList;
import java.util.List;

public class Bank{
    //Atributte
    private String name; //Tên ngân hàng
    private List<Customer> customers; //Danh sách khách hàng
    private List<Account> accounts; //Danh sách tài khoản ngân hàng
    //Constructor
    public Bank(String name){
        this.name = name;
        this.customers = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }
    //thêm khách hàng mới 
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    //thêm tài khoản mới 
    public void addAccount(Account account){
        accounts.add(account);
    }
    // Truy xuất khách hàng bằng ID
    public Customer getCustomer (String customerID){
        for(Customer customer : customers){
            if (customer.getId().equals(customerID)){
                return customer;
            }
        }
        return null;
    }
    // Truy xuất tài khoản bằng số tài khoản
    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
    