
public class Bill extends LegislativeEntity {  // Abstraction
    private String billId;
    private String title;
    private String description;
    private String status;

    public Bill(String billId, String title, String description, String status) {
        this.billId = billId;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    // Copy constructor
    public Bill(Bill otherBill) {
        this.billId = otherBill.billId;
        this.title = otherBill.title;
        this.description = otherBill.description;
        this.status = otherBill.status;
    }

    @Override
    public void displayInfo() {  // Abstraction and Polymorphism: Overriding
        System.out.println("Bill ID: " + billId);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    
}
