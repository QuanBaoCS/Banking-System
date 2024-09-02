
import java.util.ArrayList;
import java.util.List;

public class Bank{
    //Atributte
    private String name;
    private List<Customer> customers;
    private List<Account> accounts;
    //Constructor
    public Bank(String name){
        this.name = name;
        this.customers = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void addAccount(Account account){
        accounts.add(account);
    }
    public Customer getCustomer (String customerID){
        for(Customer customer : customers){
            if (customer.getId().equals(customerID)){
                return customer;
            }
        }
        return null;
    }
}