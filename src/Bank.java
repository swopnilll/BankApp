import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Sydney Bank");

        System.out.println("To open your bank account, enter your name");
        String name = sc.nextLine();
        Customer customer1 = new Customer(name);

        System.out.println("Select the type of account");

        String accountType = sc.nextLine();

        System.out.println("Please add cash to make the deposit");

        double money = sc.nextDouble();

        customer1.createAccount(accountType, money);

        Account account = customer1.getAccountInfo("Savings");

        System.out.println("main:12" +account);

        System.out.println((customer1.getName()));
        System.out.println(account.getType());
        System.out.println(account.getBalance());

    }
}