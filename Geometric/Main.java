package Geometric;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double height,width;
        String color;
        char x;
        boolean is_filled;
        Scanner scan=new Scanner(System.in);
        System.out.println("\t\t WELCOME TO LAB TASK 7");
        System.out.println("Height: ");
        height=scan.nextDouble();scan.nextLine();
        System.out.print("\nWidth: ");
        width=scan.nextDouble();scan.nextLine();
        System.out.print("\nColor: "); color=scan.nextLine();

        System.out.print("\nIs the rectangle filled? Enter y for yes and n for no: ");
        x=scan.next().charAt(0);//entering letter

        if(x=='y'||x=='Y')
            is_filled=true;
        else
            is_filled=false;

        Rectangle rect = new Rectangle(width, height);
        rect.setColor(color);
        rect.setFilled(is_filled);
            
        System.out.println("\n--- Rectangle Details ---");
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println("Color: " + rect.getColor());
        System.out.println("Filled: " + rect.isFilled());
        System.out.println(rect.toString());
    }

}
