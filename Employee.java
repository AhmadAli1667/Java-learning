public class Employee   //Defining public class
 {
    String firstname;
    String lastname;
    double monthly_salary;
    double yearly;
    
    public Employee( String firstname,String lastname,double monthly_salary)
    {
        this.firstname=firstname;  //using this to save values into data members
        this.lastname=lastname;
        this.monthly_salary=monthly_salary;
        this.yearly=12*monthly_salary; //finding yearly salary by multiplying num of months
    }
    public double raise()//function returning double aimed at changing monthly and yearly salary
    {
        this.monthly_salary+=10*this.monthly_salary/100; //Giving raise to monthly
        this.yearly=12*monthly_salary;//finding yearly after raise
        return this.yearly;  //returning yearly salary after raise to display function
    }
    public void display()//void dipslay function
    {
        System.out.println("\t\tEmployee information");
        System.out.println("NAME= "+firstname+" "+lastname);
        System.out.println("Monthly pay: "+monthly_salary);
        System.out.println("Yearly salary: "+yearly);
        System.out.println("Yearly salary after 10% raise: "+raise());//calling raise function
        
    }

}
