package Labs;
public class assign_Zoo //public class containing zoo info
{
    public static void main(String []args)//main function
    {
        Animal[] Arr=new Animal[4]; //4 array object

        Arr[0]=new Dog("Dog Doggie",2,"German Shephard");
        Arr[1]=new Eagle("Eagle Ed",3,56);
        Arr[2]=new Eagle("Eagle Ali",5,73);
        Arr[3]=new Fish("Fish Goldie",1,"Sparkling");

        for(int i=0;i<4;i++)//for loop for all objects
            Arr[i].display();//calling override display function
        System.out.println("\t\t\tTotal animals in the zoo are: "+Arr.length);//Finding length
        
    }
}
abstract class Animal {
    String name;
    int age;

    Animal(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public abstract void makesound();//polymorphed functions overide
    public abstract void move();
    
    public void display()//public display function
    {
        System.out.println("\t\t\tAnimal details");
        System.out.println("Name: "+this.name+"\nAge: "+this.age);
        makesound();
        move();
    }
}
class Dog extends Animal{
    String breed;
    public Dog(String name, int age, String breed)
    {
    super(name,age);    //super constructor calling
    this.breed=breed;
    }
    public void display()
    {
        super.display();//calling display function of super
        System.out.println("Breed: "+this.breed);
    }
    public void makesound()
    {
        System.out.println(this.name+ " says: Woof! Woof!");
    }
    public void move()
    {
        System.out.println(this.name+ " runs on four legs");

    }
    
}

class Eagle extends Animal{
    double wingSpanCm;
    public Eagle(String name, int age, double wingSpanCm)
    {
    super(name,age);//calling super constructor
    this.wingSpanCm=wingSpanCm;
    }
    public void display()//display function
    {
        super.display();
    }
    public void makesound()
    {
        System.out.println(this.name+ " screeches loudly!");
    }
    public void move()
    {
        System.out.println(this.name+ " soars with a wingspan of "
         + this.wingSpanCm+" cm");

    }
}

class Fish extends Animal//subclass
{
    String waterType;
    public Fish(String name, int age, String waterType )
    {
    super(name,age);//calling super class constructor
    this.waterType=waterType;
    }
    public void display()
    {
        super.display();//display of super 
    }
    public void makesound()
    {
        System.out.println(this.name+ " makes fish sound");
    }
    public void move()
    {
        System.out.println(this.name+ " swims really fast in "
        + this.waterType+" type of water");

    }
}
