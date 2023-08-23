import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Customer {
    private String name;

    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<Account>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    public Account getAccountInfo(String name){

        System.out.println(this.toString());

        if(this.accounts == null){
            System.out.println("No accounts created yet");
            return null;
        }

        System.out.println(this.accounts.stream()
                .filter(account -> account.getType().equals(name)).count());

        if(this.accounts.stream().noneMatch(account -> account.getType().equals(name))){
            System.out.println("No accounts matched");
            return null;
        }

        Account accountInfo = this.accounts.stream()
                .filter(account -> account.getType().equals(name))
                .findFirst()  // Adding this to retrieve the first matching account
                .orElse(null); // Return null if no matching account is found

        return accountInfo;

    }

    public void createAccount(String name, double balance){
        Account account = new Account(name, balance);

        System.out.println(this);

        this.accounts.add(account);
    }
}
