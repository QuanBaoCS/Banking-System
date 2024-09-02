import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerID; //Mã định danh duy nhất cho 1 khách hàng
    private  String name; //Tên khách hàng
    private String address; //Địa chỉ khách hàng
    private List<Account> accounts; // Danh sách tài khoản liên kết với khách hàng

    public Customer(String customerID, String name, String address){
        this.customerID = customerID;
        this.name =  name;
        this.address = address;
        this.accounts = new ArrayList<>();
    }
    //Thêm tài khoản mới 
    public void addAccount (Account account){
        accounts.add(account);
    }
    //Tính tổng số dư trong tài khoản ngân hàng
    public void getTotalBalance(){
        double totalBalance = 0.0;
        for (Account account : accounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }
    //Setter và Getter dữ liệu
    public String getCustomerID(){
        return customerID;
    }
    public void setCustomerID(String customerID){
        this.customerID = customerID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public List<Account> getAccounts (){
        return accounts;
    }
    public void setAccounts(List<Account>accounts){
        this.accounts = accounts;
    }
}


