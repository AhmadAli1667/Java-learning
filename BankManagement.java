import java.util.Scanner;

// Customer class to hold user details
class Customer {
    private String name;
    private int accountNumber;
    private double balance;

    // Constructor
    public Customer(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Methods
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class BankManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example: pre-set customer object
        Customer customer = new Customer("Ahmad", 12345, 5000.0);

        System.out.println("Enter your account number: ");
        int enteredAccount = scanner.nextInt();

        if (enteredAccount == customer.getAccountNumber()) {
            System.out.println("Welcome, " + customer.getName());
            System.out.println("Choose an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Check Balance");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    customer.withdraw(amount);
                    break;
                case 2:
                    customer.checkBalance();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } else {
            System.out.println("Account not found.");
        }

        scanner.close();
    }
}


