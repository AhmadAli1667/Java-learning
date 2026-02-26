

public class ATM {
    private String accountNumber; 
    private String password;
    private String name;
    private double balance;
    private String accountType;

    // Counter to track login attempts
    private int attempts = 0;
    private boolean locked = false;

    // Default constructor
    public ATM() {
        this.password = "1234";
        this.name = "Unknown";
        this.balance = 10000;
        this.accountType = "Saving";
    }

    // Partial constructor
    public ATM(String accountNumber, String password) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.name = "Unknown";
        this.balance = 0;
        this.accountType = "Saving";
    }

    // Full constructor with validation
    public ATM(String accountNumber, String password, String name, double balance, String accountType) {

        // checking all validation rules
        if (balance >= 0 &&
            (accountType.equals("Saving") || accountType.equals("Current")) &&
            password.length() == 4 &&
            accountNumber.length() == 5) {

            this.accountNumber = accountNumber;
            this.password = password;
            this.name = name;
            this.balance = balance;
            this.accountType = accountType;
        }
        else {
            // manually assigning default values instead of calling constructor
            System.out.println("Invalid Data! Creating default account...");

            this.accountNumber = "11111";
            this.password = "1234";
            this.name = "Unknown";
            this.balance = 10000;
            this.accountType = "Saving";
        }
    }

    // Login system with 3 attempts limit
    public boolean login(String acc, String pass) {

        if (locked) {
            System.out.println("Account Locked. Try Again Later.");
            return false;
        }

        if (acc.equals(this.accountNumber) && pass.equals(this.password)) {
            System.out.println("Login Successful!");
            attempts = 0;   // reset attempts after success
            return true;
        }
        else {
            attempts++;
            System.out.println("Incorrect Credentials.");

            if (attempts >= 3) {
                locked = true;
                System.out.println("Account Locked. Try Again Later.");
            }
            return false;
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit Successful. Updated Balance: " + this.balance);
        } else {
            System.out.println("Invalid Deposit Amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= this.balance && amount > 0) {
            this.balance -= amount;
            System.out.println("Withdrawal Successful. Updated Balance: " + this.balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Current Balance: " + this.balance);
    }

    // Display account information
    public void displayInfo() {
        System.out.println("\n--- Account Information ---");
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.name);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Balance: " + this.balance);
    }

    // Main method
    public static void main(String[] args) {

        // Creating 3 objects
        ATM acc1 = new ATM(); // default constructor
        ATM acc2 = new ATM("54321", "4321"); // partial constructor
        ATM acc3 = new ATM("99999", "1111", "Ali", 5000, "Current"); // full constructor

        // Simulating login and transactions

        if (acc3.login("99999", "1111")) {
            acc3.deposit(1000);
            acc3.withdraw(2000);
            acc3.checkBalance();
            acc3.displayInfo();
        }

        // testing login failure
        acc2.login("54321", "0000");
        acc2.login("54321", "0000");
        acc2.login("54321", "0000");
    }
}