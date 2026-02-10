// // HelloWorld.java
// class X{
//     int z = 20, k = 30;
//     public void printSum() {
//         System.out.println(z + k);
//     }
// }
// public class HelloWorld{
//     public static void main(String[] args) {
//         X kay = new X();
//         kay.printSum();
//     }
// }

//  NEXT PROGRAM
// public class HelloWorld
// {
//     public static void main(String args[])
//     {
//         System.out.println("Welcome to Java Programming!");
//         System.out.println("Working first time");
//     }
// }

import java.util.Scanner;
public class WORKING
{
public static void main(String[] args)
{
    char z='y';
Scanner in = new Scanner(System.in);
System.out.println("WELCOME TO A JAVA PROGRAM!\n We are first going to find sum of two numbers");
while(z=='y'|z=='Y')
{
System.out.println("Enter number");
int a=in.nextInt();
System.out.println("Enter number");
int b=in.nextInt();

System.out.print("The sum is: " + (a+b));
System.out.print("DO YOU WANT TO CONTINUE (WRITE Y FOR YES AND N FOR NO) ");
z=in.next().charAt(0);
}

in.close();
}
}

