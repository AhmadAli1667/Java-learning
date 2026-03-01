package KEY_CONCEPTS;
public class Person_usingsuper {
    String name = "Ahmad";
    String address = "HOUSE 253";
    String phone_number = "0233223";
    String email = "ahmadsh2390@gmail.com";

    public static void main(String[] args) {

        Student s1 = new Student("Freshman");

        Employee e1 = new Employee("OLD GYM", 53233.0, "25th August 2025");

        Faculty f1 = new Faculty("New Gym", 65000.0, "20th July 2024", "9AM-12PM", "Physics Professor");

        Staff s2 = new Staff("Main Office", 40000.0, "10th June 2023", "Leader");
    }

    public void display() {
        System.out.println("\n\t\tInformation:");
        System.out.println("NAME = " + this.name);
        System.out.println("NAME = " + this.name);
        System.out.println("Address = " + this.address);
        System.out.println("Phone number = " + this.phone_number);
        System.out.println("Email = " + this.email);
    }
}

class Student extends Person_usingsuper {

    String status;

    Student(String status) {
        this.status = status;
        this.display();
        System.out.println("Status: " + this.status);
    }
}

class Employee extends Person_usingsuper {

    String office;
    Double salary;
    String date_hired;

    Employee(String office, Double salary, String date_hired) {
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;

        this.display();
        System.out.println("Office: " + this.office);
        System.out.println("Salary: " + this.salary);
        System.out.println("Date hired: " + this.date_hired);
    }
}

class Faculty extends Employee {

    String officeHours;
    String rank;

    Faculty(String office, Double salary, String date_hired,
            String officeHours, String rank) {

        super(office, salary, date_hired);

        this.officeHours = officeHours;
        this.rank = rank;

        System.out.println("Office Hours: " + this.officeHours);
        System.out.println("Rank: " + this.rank);
    }
}

class Staff extends Employee {

    String title;

    Staff(String office, Double salary, String date_hired, String title) {

        super(office, salary, date_hired);

        this.title = title;

        System.out.println("Title: " + this.title);
    }
}