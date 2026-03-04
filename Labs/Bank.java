abstract class Payment {
    String transactionId;
    double amount;

    Payment(String id, double amt) {
        transactionId = id;
        amount = amt;
    }

    abstract void processPayment() {
        System.out.println("Processing...");
    }

    void printSummary() {
        System.out.println("TXN: " + transactionId + " | Amount: " + amount);
        processPayment();
    }
}

class CreditCard extends Payment {
    String cardNumber;

    CreditCard(String id, double amt, String card) {
        super(id, amt);
        cardNumber = card;
    }
    // processPayment() not overridden
}

class UPI extends Payment {
    String upiId;

    UPI(String id, double amt, String upi) {
        super(id, amt);
        this.upiId = upi;
    }

    void processPayment() {
        System.out.println("UPI transfer via " + upiId);
    }
}

public class Bank {
    public static void main(String[] args) {
        Payment p = new Credit("TX001", 5000);
        p.printSummary();
    }
}

