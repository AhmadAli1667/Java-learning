package Simple_programs;
import java.util.ArrayList;

abstract class Appliance {
    String applianceName; //defining data members
    int wattage;
    Boolean isON=false;

    public Appliance(String applianceName, int wattage) //double parameter constructor
    {
        this.applianceName=applianceName;  //setting values
        this.wattage=wattage;
    }

    abstract public void operate();
    abstract public double calculateHourlyCost(double ratePerKwh);
    public void turnOn()
    {
        this.isON=true;
        System.out.println("\n"+this.applianceName+" is now ON");
    }
    public void turnOff()
    {
        this.isON=false;
        System.out.println("\n"+this.applianceName+" is now OFF");
    }
    
    public void getStatus()
    {
        String status = isON ? "ON" : "OFF";//checking if ON or OFF
        System.out.println(applianceName + " | Wattage: " + wattage + "W | Status: " + status);//Printing Information
    }
    
    
}
class AirConditioner extends Appliance
{
    int tempCelsius;//defining datamembers
    boolean coolMode;

    public AirConditioner(int tempCelsius, boolean coolMode, int wattage)
    {
        super("Air Conditioner", wattage);
        this.coolMode=coolMode;
        this.tempCelsius=tempCelsius;
    }
    
    public double calculateHourlyCost(double ratePerKwh){
        return (this.wattage / 1000.0 * ratePerKwh * 1.2);  //returning calculated data
    }
    public void operate()
    {
        if(this.coolMode)
            System.out.println("Cooling to "+this.tempCelsius);//operating function cooling
        else
            System.out.println("Heating to "+this.tempCelsius);//operating function heating
            
    }
    void setTemperature(int temp)
    {
        this.tempCelsius=temp;//setting temperature
        System.out.println("Temperature updated to: "+this.tempCelsius);
    }
}

class WashingMachine extends Appliance
{
    int cycleMinutes;//defining datamembers
    double loadKg;
    public WashingMachine(int cycleMinutes, double loadKg, int wattage)
    {
        super("Washing Machine", wattage);//loading super constructor 
        this.loadKg=loadKg;
        this.cycleMinutes=cycleMinutes;
    }

    public double calculateHourlyCost(double ratePerKwh){
        return (wattage / 1000.0) * ratePerKwh * (cycleMinutes / 60.0); //returning calculated data
    }
  public void operate()
{
    System.out.println("Washing " + this.loadKg + "kg load. Cycle: " + this.cycleMinutes + " minutes");
}

}
class SmartController
{
    void schedule(Appliance a)//single parameter function
    {
        System.out.println("\nScheduled "+a.applianceName+" with default 1-hour runtime");
    }
    void schedule(Appliance a,int hours)//DOUBle overloaded parameter function
    {
        System.out.println("\nScheduled "+a.applianceName+" for "+hours+" hours");
    }
    void schedule(Appliance a, int hours, String timeSlot)//Triple overloaded parameter function
    {
        System.out.println("\nScheduled "+a.applianceName+"for "+hours+" hours at "+timeSlot);
    }
}
public class SmartHome
{
   public static void main(String[] args) {
      ArrayList<Appliance> A = new ArrayList<>(); 
      A.add(new AirConditioner(23, true, 2000));//calling constructors
      A.add(new WashingMachine(60, 5.0, 1500));
      
      // Turn on and operate
      for (Appliance appliance : A) {//calling methods
         appliance.turnOn();
         appliance.operate();
         appliance.getStatus();
      }
      
      // SmartController scheduling
      SmartController controller = new SmartController();//making smart controller objects
      controller.schedule(A.get(0));
      controller.schedule(A.get(0), 2);//making constructor
      controller.schedule(A.get(0), 2, "10:00 AM");
      
      // Print hourly costs
      System.out.println("\nAC hourly cost: Rs. " + A.get(0).calculateHourlyCost(25));
      System.out.println("Washing Machine hourly cost: Rs. " + A.get(1).calculateHourlyCost(25));
   }
}
