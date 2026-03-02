import java.util.ArrayList;//importing arraylist
import java.util.List;//importing list

//Defining abstract class 
abstract class Vehicle {

    private int vehicleid;
    private String driverName;//defining private members
    private double fuelCapacity;
    private double currentFuel;

    protected static double totalFuelConsumed = 0;//static variable total fuel consumed by all vehicles
    protected static int totalTrips = 0;//static variable total number of trips completed

    Vehicle(int vehicleid,String driverName, double fuelCapacity, double currentFuel)
    {
        this.vehicleid=vehicleid;
        this.driverName=driverName;
        this.fuelCapacity=fuelCapacity;
        this.currentFuel=currentFuel;
    }

    public void refuel(int amount)//refueling current fuel
    {
        if (currentFuel+amount<=fuelCapacity)//checking condition
		{
            currentFuel+=amount;//adding fuel if within capacity
		}
		else
        {
            currentFuel=fuelCapacity;//if more than fuel capacity then fuel will be set equal to capacity
        }
        System.out.println("Vehicle Refueled .Current Fuel : "+ currentFuel);
    }
        
    public void displayDetails()//displaying vehicle details
    {
        System.out.println("\nVehicle id= "+this.vehicleid+
         "\nDriver name= "+this.driverName+
        "\nFuel Capacity: "+this.fuelCapacity
        +"\nCurrent fuel:  "+this.currentFuel);
    }

    public double GetCurrentFuel()//getter method to get current fuel
    {
        return this.currentFuel;
    }

    public void setCurrentFuel(double currentFuel)//setter method to update fuel
    {
        this.currentFuel=currentFuel;
    }

    public static double getTotalFuelConsumed()//getter for total fuel consumed
    {
        return totalFuelConsumed;
    }

    public static int getTotalTrips()//getter for total trips
    {
        return totalTrips;
    }

    public abstract void startService();//abstract method to start service
    public abstract void calculateFuelConsumption();//abstract method to calculate fuel consumption
}


//Bus class extending Vehicle
class Bus extends Vehicle
{
    public Bus(int vehicleid,String driverName, double fuelCapacity, double currentFuel)
    {
        super(vehicleid,driverName,fuelCapacity,currentFuel);//calling super constructor to save values
    }

    public void startService()
    {
        if(super.GetCurrentFuel()>=5)//checking if enough fuel for one trip
        {
            System.out.println("Starting Bus");//outputting this message
            calculateFuelConsumption();//calling fuel consumption method
        }
        else
        {
            System.out.println("Insufficient fuel for service.");//printing message if fuel less
        }
    }

    public void calculateFuelConsumption()
    {
        double remainingFuel=super.GetCurrentFuel()-5;//subtracting 5 litres per trip
        setCurrentFuel(remainingFuel);//updating fuel using setter
        totalFuelConsumed+=5;//adding 5 to total fuel consumed
        totalTrips++;//increasing total trips count
    }
}


//Van class extending Vehicle
class Van extends Vehicle
{
    public Van(int vehicleid,String driverName, double fuelCapacity, double currentFuel)
    {
        super(vehicleid,driverName,fuelCapacity,currentFuel);//calling super constructor
    }

    public void startService()
    {
        if(super.GetCurrentFuel()>=3)//checking if enough fuel for one trip
        {
            System.out.println("Starting Van");//outputting this message
            calculateFuelConsumption();//calling fuel consumption
        }
        else
        {
            System.out.println("Insufficient fuel for service.");//printing message
        }
    }

    public void calculateFuelConsumption()
    {
        double remainingFuel=super.GetCurrentFuel()-3;//subtracting 3 litres per trip
        setCurrentFuel(remainingFuel);//updating fuel
        totalFuelConsumed+=3;//adding 3 to total fuel consumed
        totalTrips++;//increasing trips
    }
}


//Electric Shuttle class extending Vehicle
class ElectricShuttle extends Vehicle
{
    public ElectricShuttle(int vehicleid,String driverName, double fuelCapacity, double currentFuel)
    {
        super(vehicleid,driverName,fuelCapacity,currentFuel);//calling super constructor
    }

    public void startService()
    {
        if(super.GetCurrentFuel()>=10)//checking if enough battery units
        {
            System.out.println("Starting Electric Shuttle");//outputting this message
            calculateFuelConsumption();//calling fuel consumption
        }
        else
        {
            System.out.println("Insufficient fuel for service.");//printing message
        }
    }

    public void calculateFuelConsumption()
    {
        double remainingFuel=super.GetCurrentFuel()-10;//subtracting 10 battery units per trip
        setCurrentFuel(remainingFuel);//updating fuel
        totalFuelConsumed+=10;//adding 10 to total fuel consumed
        totalTrips++;//increasing trips
    }
}


//Main class
public class Transportprob
{
    public static void main(String []args)
    {
        ArrayList<Vehicle> v = new ArrayList<>();//creating arraylist of type Vehicle

        //adding different vehicles to arraylist
        v.add(new Bus(34535,"Ahmad",23,14));
        v.add(new Van(2115,"Ali",323,32));
        v.add(new Bus(55335,"Hasan",23,14));
        v.add(new ElectricShuttle(53344,"Hamza",50,20));
        v.add(new Van(44334,"Ayesha",54,2));

        for(Vehicle V:v)//looping through arraylist using polymorphism
        {
            System.out.println("\n\t\t\tInfo before trip");
            V.displayDetails();//displaying details before service

            V.startService();//starting service (polymorphism used here)

            System.out.println("\t\t\tInfo after trip");
            V.displayDetails();//displaying details after service
        }

        //displaying final results
        System.out.println("\nTotal fuel consumed by all vehicles: "+Vehicle.getTotalFuelConsumed());
        System.out.println("Total number of trips completed: "+Vehicle.getTotalTrips());
    }
}