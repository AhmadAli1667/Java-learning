import java.util.Scanner;

class Publication {
    private String title;// definining data members as private 
    private float price;

    public void setData(Scanner sc) {//set data method to use later and introducing scanner object
        System.out.print("Enter title: ");
        title = sc.nextLine();//getting title from user

        System.out.print("Enter price: ");
        price = sc.nextFloat();
        sc.nextLine();
    }

    public void putData() {//putting function printing
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

class Book extends Publication //subclass BOOK
{
    private int pageCount;

    @Override//overriding method
    public void setData(Scanner sc) {
        super.setData(sc);//calling super instance of overloaded function
        System.out.print("Enter page count: ");
        pageCount = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void putData() {
        super.putData();
        System.out.println("Page Count: " + pageCount);
    }
}

class Tape extends Publication //Tape subclass
{
    private float playingTime;//private data members

    @Override //overriding function
    public void setData(Scanner sc) {
        super.setData(sc);//calling super function
        System.out.print("Enter playing time (minutes): ");
        playingTime = sc.nextFloat();//getting time
        sc.nextLine();
    }

    @Override
    public void putData() //printing data
    {
        super.putData();
        System.out.println("Playing Time (minutes): " + playingTime);
    }
}

public class LabTask1_Publication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Publication book = new Book(); 
        Publication tape = new Tape();

        System.out.println("\t\tEnter Book Details");
        book.setData(sc);

        System.out.println();//to clear line
        System.out.println("\t\t Enter Tape Details");
        tape.setData(sc);

        System.out.println();
        System.out.println("\t\tBook Data");
        book.putData();

        System.out.println();
        System.out.println("\t\t Tape Data ");
        tape.putData();

        sc.close();//closing the scanner object
    }
}
