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
        System.out.println(this.applianceName+" is now ON");
    }
    public void turnOff()
    {
        this.isON=false;
        System.out.println(this.applianceName+" is now OFF");
    }
    
    public void getStatus()
    {
        this.isON=false;//checking to false
        System.out.println(this.applianceName+ " | Wattage: "+ this.wattage+ "W | Status: ON/OFF");//printing data
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
        System.out.println("Washing "+this.loadKg+" with Cycle "+this.cycleMinutes);//operating function loading
    }

}
class SmartController
{
    void schedule(Appliance a)//single parameter function
    {
        System.out.println("Scheduled "+a+" with default 1-hour runtime");
    }
    void schedule(Appliance a,int hourse)//DOUBle overloaded parameter function
    {
        System.out.println("Scheduled "+a+" with default 1-hour runtime");
    }
    void schedule(Appliance a, int hours, String timeSlot)//Triple overloaded parameter function
    {
        System.out.println("Scheduled "+a+" with default 1-hour runtime");
    }
}

// (d)  Method Overloading — class SmartController  [2 Marks]
// Create a separate class SmartController with an overloaded method schedule():
// • schedule(Appliance a)  — prints: "Scheduled <name> with default 1-hour runtime"
// • schedule(Appliance a, int hours)  — prints: "Scheduled <name> for <hours> hours"
// • schedule(Appliance a, int hours, String timeSlot)  — prints: "Scheduled <name> for <hours> hours at <timeSlot>"
