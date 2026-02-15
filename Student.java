public class Student 
{
	private int studentid;  //PRIVATE TO INDUCE ENCAPSULATION 
	private String name;
	private double gpa;
	private String course;
	public Student(int studentId, String name, double gpa, String course)//INITIALIZING GIVEN VALUES AS PARAMETERS
	{
        this.studentid = studentId;  //using this to initialize members
        this.name = name;
        this.gpa = gpa;
        this.course = course;
    }
	public Student()   //INITIALIZING TO DEFAULT VALUES
	{
		this.studentid=0;
		this.name="Unknown";
		this.gpa=0.0;
	   this.course="Not Assigned";
	}
	public void updateGPA(double newGPA)  //Validation check
	{
       if(newGPA>0&&newGPA<4.0)
		{
			this.gpa=newGPA;
			System.out.println("[After update] GPA updated to: "+newGPA);
		}        
	   else
		System.out.println("GPA cannot be updated");
	}
	public String getScholarshipStatus()
	{
		if(this.gpa>=3.5)  //Calling the gpa value itself of the instance class 
			return "Eligible";
		else
			return "Not Eligible";
	}
	public void display()   //DISPLAYING INFO ABOUT THE STUDENT
	{
		System.out.println("\t\tSTUDENT INFORMATION: ");
		System.out.println("Student ID: "+studentid+" Name: "+name+" gpa: "+gpa+" Course: "+course);
	}
	public static void main(String [] args)
	{
		Student s2=new Student(); //making an object constructor
		s2.display();
		Student s1 = new Student(1001,"John Doe",3.75,"Computer Science");
		s1.display();
		System.out.println("Scholarship Status: "+s1.getScholarshipStatus()); //calling schoalrship function
		s1.updateGPA(3.90); //calling update function
	}
}

