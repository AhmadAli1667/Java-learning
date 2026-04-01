import java.util.Scanner;

class Machine {
    protected String machineName;//Data members protected for encapsulation
    protected String type;
//writing setter getter methods 
    public void setMachineName(Scanner sc) //importing object of scanner 
    {
        System.out.print("Enter machine name: ");
        machineName = sc.nextLine();
    }

    public void displayMachineName() {
        System.out.println("Machine Name: " + machineName);
    }

    public void setModel(Scanner sc) {
        System.out.print("Enter machine model: ");
        model = sc.nextLine();
    }

    public void displayModel() {
        System.out.println("Model: " + model);
    }

    public void setType(Scanner sc) {
        System.out.print("Enter machine type: ");
        type = sc.nextLine();
    }

    public void displayType() {
        System.out.println("Type: " + type);
    }
    //NOW LETS DEFINE THE OVERLOADING METHODS 
    void setProcessorDescription(Scanner sc) {
    System.out.println("overloading");
}

void setMemoryDetails(Scanner sc) {
    System.out.println("overloading");
}

void setStatus(Scanner sc) {
    System.out.println("overloading");
}

void displayProcessorDescription() {
    System.out.println("overloading");
}

void displayMemoryDetails() {
    System.out.println("overloading");
}

void displayStatus() {
    System.out.println("overloading");
}
}

class Computer extends Machine //subclass computer
{
    private String processorDescription;//private data members
    private String Details;
    private String status;
//SETTER GETTER METHODS
    public void setProcessorDescription(Scanner sc) {
        System.out.print("Enter processor description: ");
        processorDescription = sc.nextLine();
    }

    public void displayProcessorDescription() {
        System.out.println("Processor: " + processorDescription);
    }

    public void setMemoryDetails(Scanner sc) {
        System.out.print("Enter details for memory: ");
        Details = sc.nextLine();

    }

    public void displayMemoryDetails() {
        System.out.println("Memory details are: " + Details);
    }

    public void setStatus(Scanner sc) {
        System.out.print("Enter status (working/scraped): ");
        status = sc.nextLine();
    }

    public void displayStatus() {
        System.out.println("Status: " + status);
    }
}

public class LabTask2_MachineComputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Machine computer = new Computer();

        System.out.println("Enter Computer Details");//setting data
        computer.setMachineName(sc);
        computer.setModel(sc);
        computer.setType(sc);
        computer.setProcessorDescription(sc);
        computer.setMemoryDetails(sc);
        computer.setStatus(sc);
        

        System.out.println();
        System.out.println("Computer Data");//printing data
        computer.displayMachineName();
        computer.displayModel();
        computer.displayType();
        computer.displayProcessorDescription();
        computer.displayMemoryDetails();
        computer.displayStatus();

        sc.close();//closing scanner
    }
}
