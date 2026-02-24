import java.util.ArrayList;
import java.util.List;

public class arraylist_dynamic_Employee {
    String Name;
    int ID;
    String Department;

 public double calculateSalary(){
    return 0;
 }

 public String getName(){
    return "unknown";
 }
public static void main(String []args)
{
ArrayList<arraylist_dynamic_Employee> employees = new ArrayList<>(List.of(
    new FullTimeFaculty("Ali", 101, "CS"),
    new PartTimeFaculty("Sara", 102, "Math"),
    new AdministrativeStaff("Ahmed", 103, "Admin"),
    new VisitingLecturer("Hina", 104, "Physics"),
    new FullTimeFaculty("Wasay", 105, "Slevel"),
    new PartTimeFaculty("Nehdia", 106, "Arts")
));
// Payroll processing
for (int i = 0; i < employees.size(); i++) {

if (employees.get(i) != null) {
System.out.println("Processing salary for: " + employees.get(i).getName());

double salary = employees.get(i).calculateSalary();

System.out.println("Salary: " + salary);
System.out.println("------------------------");
}
}
}
}
class FullTimeFaculty extends arraylist_dynamic_Employee{
    public FullTimeFaculty(String name, int id, String Department)
    {
        this.Name=name;
        this.ID=id;
        this.Department=Department;
    }
    public String getName(){
        return this.Name;
    }
    public double calculateSalary()
    {
        return 20000;
    }
}
class PartTimeFaculty extends arraylist_dynamic_Employee{
    public PartTimeFaculty(String name, int id, String Department)
    {
        this.Name=name;
        this.ID=id;
        this.Department=Department;
    }
      public String getName(){
        return this.Name;
    }
     public double calculateSalary()
    {
        return 30000;
    }
}
class AdministrativeStaff extends arraylist_dynamic_Employee{
    public AdministrativeStaff(String name, int id, String Department)
    {
        this.Name=name;
        this.ID=id;
        this.Department=Department;
    }
      public String getName(){
        return this.Name;
    }
     public double calculateSalary()
    {
        return 40000;
    }
}
class VisitingLecturer extends arraylist_dynamic_Employee{
    public VisitingLecturer(String name, int id, String Department)
    {
        this.Name=name;
        this.ID=id;
        this.Department=Department;
    }
      public String getName(){
        return this.Name;
    }
     public double calculateSalary()
    {
        return 50000;
    }
}



// public class Employee {
//     String Name;
//     int ID;
//     String Department;
// -
//  public double calculateSalary(){
//     return 0;
//  }

//  public String getName(){
//     return "unknown";
//  }
// public static void main(String []args)
// {
//     Employee[] employees = new Employee[10];

// employees[0] = new FullTimeFaculty("Ali", 101, "CS");
// employees[1] = new PartTimeFaculty("Sara", 102, "Math");
// employees[2] = new AdministrativeStaff("Ahmed", 103, "Admin");
// employees[3] = new VisitingLecturer("Hina", 104, "Physics");
// employees[4] = new FullTimeFaculty("wasay", 101, "Slevel");
// employees[5] = new PartTimeFaculty("nehdia", 102, "arts");


// // Payroll processing
// for (int i = 0; i < employees.length; i++) {

// if (employees[i] != null) {
// System.out.println("Processing salary for: " + employees[i].getName());

// double salary = employees[i].calculateSalary();

// System.out.println("Salary: " + salary);
// System.out.println("------------------------");
// }
// }
// }
// }
// class FullTimeFaculty extends Employee{
//     public FullTimeFaculty(String name, int id, String Department)
//     {
//         this.Name=name;
//         this.ID=id;
//         this.Department=Department;
//     }
//     public String getName(){
//         return this.Name;
//     }
//     public double calculateSalary()
//     {
//         return 20000;
//     }
// }
// class PartTimeFaculty extends Employee{
//     public PartTimeFaculty(String name, int id, String Department)
//     {
//         this.Name=name;
//         this.ID=id;
//         this.Department=Department;
//     }
//       public String getName(){
//         return this.Name;
//     }
//      public double calculateSalary()
//     {
//         return 30000;
//     }
// }
// class AdministrativeStaff extends Employee{
//     public AdministrativeStaff(String name, int id, String Department)
//     {
//         this.Name=name;
//         this.ID=id;
//         this.Department=Department;
//     }
//       public String getName(){
//         return this.Name;
//     }
//      public double calculateSalary()
//     {
//         return 40000;
//     }
// }
// class VisitingLecturer extends Employee{
//     public VisitingLecturer(String name, int id, String Department)
//     {
//         this.Name=name;
//         this.ID=id;
//         this.Department=Department;
//     }
//       public String getName(){
//         return this.Name;
//     }
//      public double calculateSalary()
//     {
//         return 50000;
//     }
// }



