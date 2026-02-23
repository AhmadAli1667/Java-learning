public class Pet {
    private String accountNumber;
    private String accountHolder;
    private String accountType;
    private double balance;
    public static void main(String[] args)
    {
        Pet p1=new dog();
        p1.methos();
        Pet p2;new cat();
        
    }
    public void methos() {
        System.out.println("Pet method");
    }
}


class dog extends Pet{
    int dog_id;
    public void methos()
    {
        System.out.println("Hello");
    }
}
class cat extends Pet{
    int cat_id;
    public cat()
    {
        System.out.println("Hello");
    }
}

// 2) Constructor with 2 parameters:
//    BankAccount(String accountNumber, String accountHolderName)
//    • balance = 0.0, accountType = "Saving"
// 3) Constructor with 4 parameters:
//    BankAccount(String accountNumber, String accountHolderName, double balance, String accountType)
// 4) Copy Constructor:
//    BankAccount(BankAccount other)
//    • It must copy all attributes from the given object.
// You must implement the following public methods:
// • void deposit(double amount), void withdraw(double amount), void displayAccountDetails()
// Validation Rules:
// • Deposit amount must be greater than 0.
// • Withdraw amount must be greater than 0 and less than or equal to balance.
// • balance cannot be negative.
// • accountType must be either "Saving" or "Current".
// • If invalid input is provided in the 4-parameter constructor, print "Invalid Input" and assign default values.
// In the main method, create at least 4 objects using different constructors:
// • One object using default constructor
// • One object using 2-parameter constructor
// • One object using 4-parameter constructor
// • One object using copy constructor
// Perform deposit and withdraw operations on at least two objects and display details.
// Create a class BankAccount that simulates a basic bank account system.
// The class BankAccount must contain the following private attributes:
// • accountNumber (String), accountHolderName (String), balance (double), accountType (String)
// Constructor Requirements (You must implement ALL):
// 1) Default Constructor (no parameters)
//    • accountNumber = "0000", accountHolderName = "Unknown", balance = 0.0, accountType = "Saving"
// 2) Constructor with 2 parameters:
//    BankAccount(String accountNumber, String accountHolderName)
//    • balance = 0.0, accountType = "Saving"
// 3) Constructor with 4 parameters:
//    BankAccount(String accountNumber, String accountHolderName, double balance, String accountType)
// 4) Copy Constructor:
//    BankAccount(BankAccount other)
//    • It must copy all attributes from the given object.
// You must implement the following public methods:
// • void deposit(double amount), void withdraw(double amount), void displayAccountDetails()
// Validation Rules:
// • Deposit amount must be greater than 0.
// • Withdraw amount must be greater than 0 and less than or equal to balance.
// • balance cannot be negative.
// • accountType must be either "Saving" or "Current".
// • If invalid input is provided in the 4-parameter constructor, print "Invalid Input" and assign default values.
// In the main method, create at least 4 objects using different constructors:
// • One object using default constructor
// • One object using 2-parameter constructor
// • One object using 4-parameter constructor
// • One object using copy constructor
// Perform deposit and withdraw operations on at least two objects and display details.

