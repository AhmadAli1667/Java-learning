public class Main
{
public static void main(String args[])
{
    underpaid u1=new underpaid();
    u1.display();
    u1.run();
}
}
class Employee{
    void display()
    {
        System.out.println("Saying things");
    }
}
class underpaid extends Employee{
    void run()
    {
        System.out.println("Working at home today");
    }
}




