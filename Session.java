// Session.java
import java.util.ArrayList;
import java.util.List;

public class Session extends LegislativeEntity {  // Inheritance and abstraction
    private String sessionId;
    private String date;
    private List<Bill> bills;

    public Session(String sessionId, String date) {
        this.sessionId = sessionId;
        this.date = date;
        this.bills = new ArrayList<>();
    }

    // Method overloading
    public void addBill(Bill bill) {
        bills.add(bill);
    }

    public void addBill(String billId, String title, String description, String status) {  // Overloaded method
        Bill bill = new Bill(billId, title, description, status);
        bills.add(bill);
    }

    @Override
    public void displayInfo() {
        System.out.println("Session ID: " + sessionId);
        System.out.println("Date: " + date);
        for (Bill bill : bills) {
            bill.displayInfo();
        }
    }

    public String getSessionId() {
        return sessionId;
    }
}
