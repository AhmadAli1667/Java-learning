import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Basically in this program we are creating a bill inventory as in a normal cash and carry. 
//
class BillCalculation {
    private final double testsCost;
    private final double medicinesCost;
    private final double hospitalizationCharges;


    public BillCalculation(double testsCost, double medicinesCost, double hospitalizationCharges) {
        this.testsCost = testsCost;
        this.medicinesCost = medicinesCost;
        this.hospitalizationCharges = hospitalizationCharges;
    }

    // Getters
    public double getTestsCost() { return testsCost; }
    public double getMedicinesCost() { return medicinesCost; }
    public double getHospitalizationCharges() { return hospitalizationCharges; }

   
    public double getTotalBill() {
        return testsCost + medicinesCost + hospitalizationCharges;
    }
    //Updated functions
    public BillCalculation withTestsCost(double newCost) {
        return new BillCalculation(newCost, this.medicinesCost, this.hospitalizationCharges);
    }
    public BillCalculation withMedicinesCost(double newCost) {
        return new BillCalculation(this.testsCost, newCost, this.hospitalizationCharges);
    }
    public BillCalculation withHospitalizationCharges(double newCost) {
        return new BillCalculation(this.testsCost, this.medicinesCost, newCost);
    }
//Printing the data
    @Override
    public String toString() {
        return "Bill[Tests=" + testsCost + ", Meds=" + medicinesCost + 
               ", Hosp=" + hospitalizationCharges + ", Total=" + getTotalBill() + "]";
    }
}

// 2. Mutable Patient Class
class Patient {
    private String name;
    private List<BillCalculation> bills;//List of all transactions ever made 

    public Patient(String name, List<BillCalculation> initialBills) {
        this.name = name;
        this.bills = new ArrayList<>(initialBills);
    }

    public void addBill(BillCalculation newBill) {
        this.bills.add(newBill);
    }

    public double getTotalPatientBill() {
        double total = 0.0;//defining total bill
        for (BillCalculation bill : bills) {//here we iterate through all possible bills and add their totals to display
            total =total+bill.getTotalBill();
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        
        
        BillCalculation bill1 = new BillCalculation(200.0, 50.0, 1000.0);//the first object saving the data permanently
        //basically we are setting the data only once hence there are no setters
         //Creating a New object
        BillCalculation bill2 = bill1.withMedicinesCost(100.0); 

        // Create mutable Patient with a list of bills
        Patient patient = new Patient("Ahmad", Arrays.asList(bill1, bill2));
        //we are copying data so that we can save it forever this is of one patient,
        // history of all their previous bills are sent from here to the constructor of the patient class 
        
    
        patient.addBill(new BillCalculation(50.0, 25.0, 0.0));

        // Print results
        System.out.println("Original Bill: " + bill1);
        System.out.println("Updated Bill: " + bill2);
        System.out.println("Total Overall Patient Balance: " + patient.getTotalPatientBill());//individual patients getting their sum
    }
}
