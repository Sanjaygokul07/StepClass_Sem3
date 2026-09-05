class FeeAccount {
    String id;

    FeeAccount(String id) {
        this.id = id;
    }
}

class HostelFeeAccount extends FeeAccount {
    HostelFeeAccount(String id) {
        super(id);
    }
}

public class PaymentProcessorDemo {
    int hostelCount = 0;
    int dayScholarCount = 0;

    void processPayment(FeeAccount account, double amount) {
        if (account instanceof HostelFeeAccount) {
            System.out.println("Paid in two installments (hostel account)");
            hostelCount++;
        } else {
            System.out.println("Paid in one go (day-scholar account)");
            dayScholarCount++;
        }
    }

    public static void main(String[] args) {
        FeeAccount[] accounts = {
            new HostelFeeAccount("H1"),
            new HostelFeeAccount("H2"),
            new FeeAccount("F1"),
            new FeeAccount("F2")
        };

        PaymentProcessorDemo processor = new PaymentProcessorDemo();
        for (int i = 0; i < accounts.length; i++) {
            processor.processPayment(accounts[i], 60000);
        }

        System.out.println("Hostel accounts processed: " + processor.hostelCount +
                " | Day-scholar accounts processed: " + processor.dayScholarCount);
    }
}