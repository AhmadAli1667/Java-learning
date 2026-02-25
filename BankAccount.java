public class BankAccount {
   private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
//DEFINING CONSTRUCTORS
    public BankAccount(BankAccount other)
    { 
        this.accountHolderName=other.accountHolderName;
        this.accountNumber=other.accountNumber;
        this.accountType=other.accountType;
        this.balance=other.balance;
    }
    public BankAccount()
    {
        this.accountNumber="0000";
        this.accountHolderName="Unknown";
        this.balance=0.0;
        this.accountType="Saving";
    }
     public BankAccount(String accountNumber, String accountHolderName)
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=0.0;
        this.accountType="Saving";
    }
    public BankAccount(String accountNumber,String accountHolderName,double balance,String accountType)
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        if(balance>=0 && accountType=="Saving"||accountType=="Current")//Validation check 
         {  
            this.balance=balance;
            this.accountType=accountType;
         }
        else
         {
            System.out.println("Invalid input");
            this.balance=0.0;//Default allotment of values
            this.accountType="Saving";
        }
    }
    public void deposit(double amount){
        if(amount>0)//deposit validation
        {    this.balance+=balance;
             System.out.println("\t\tSuccessful Deposit! \nBalance= "+this.balance);//Success message
    }
    }
    public void withdraw(double amount)
    {
        if(amount>0 && amount <=this.balance)//to check if greater than 0 and less than balance
         {   this.balance-=amount;
            System.out.println("\t\tSuccessful withdrawal! \nRemaining Balance= "+this.balance);//Success message
         }   
         else
            System.out.println("Unsufficient amount! Withdrawl failed");
    }
    public void displayAccountDetails(){  //displaying information function
        System.out.println("\t\tBank Information details");
        System.out.println("Account Number: "+this.accountNumber
                        +"\nAccount Holder name: "+this.accountHolderName
                        +"\nAccount Balance: "+this.balance
                        +"\nAccount Type: "+this.accountType);
                        
    }
    public static void main(String []args)//Main function
    {
        BankAccount b1=new BankAccount();//without parameter constructor
        BankAccount b2=new BankAccount("547372","Ahmad");//2 parameter constructor
        BankAccount b3=new BankAccount("3244","Ali Saqib",40202.0,"Current");//4 parameter constructor
        BankAccount b4=new BankAccount(b3);
        b2.displayAccountDetails();
        b2.deposit(2333);
        b2.withdraw(120);
        b4.displayAccountDetails();//calling functions
        b4.deposit(2333);
        b4.withdraw(120);
    }
}

