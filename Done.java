import java.util.Scanner;
public class Done{
    public static void main(String[] args) {
        Management student = new Management();
        student.setid();
        student.setname();
        student.setgpa();
        student.display();
    }
}
class Management {
    int id;
    String name;
    float cgpa;
    Scanner scan = new Scanner(System.in);

    void setid() {
        System.out.print("ID: ");
        id = scan.nextInt();
    }
    void setname() {
        System.out.print("Name: ");
        scan.nextLine();   // consume leftover newline
        name = scan.nextLine();
    }
    void setgpa() {
        System.out.print("GPA: ");
        cgpa = scan.nextFloat();
    }
    char findgrade(float x) {
        if (x > 2.0)
            return 'P';
        else
            return 'F';
    }
    void display() {
        System.out.println("\n\t\tINFORMATION OF STUDENT");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + cgpa);
        System.out.println("Grade: " + findgrade(cgpa));
    }
}
