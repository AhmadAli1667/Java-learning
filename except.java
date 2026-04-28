import java.util.*;
public class except {
    public static void main(String []args)
    {
    Scanner scan=new Scanner(System.in);  //the scanner object scan is used to input the numbers
    int x,y;
    try{//Using try to deal with the exception that might come when y nis 0 and needs to divide x
        System.out.print("Enter number ");//Here we ask the user tio input the num 
        x=scan.nextInt();
        System.out.print("Enter number ");
        y=scan.nextInt();
        int z=x/y;
            //If no exception is called then this part will be executed hence successful result
            System.out.println("Successful division\n Your Answer is "+z);
        }
        catch(ArithmeticException ae)//Here we deal with the arithmetic exception of if divided by zero
        {
            System.out.println("Error: Cannot divide by zero: "+ae);
            
        }
        catch(InputMismatchException ime)//here we are creating an object of input mismatch exception dealing with that
        {//If the user inputs a non integer then this wil be called
            System.out.println("You can only use integers"+ime);
        }
        finally//This will execute regardless of if exception is called or handled
        {
            System.out.println("Division Operation Completed");
        }
}
}


