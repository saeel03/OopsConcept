// Assembly.java
import java.util.ArrayList;
import java.util.List;

public class Assembly {
    private List<Member> members;
    private List<Session> sessions;
    private List<Bill> bills;

    public Assembly() {
        this.members = new ArrayList<>();
        this.sessions = new ArrayList<>();
        this.bills = new ArrayList<>();
    }

    @ImportantMethod(info = "Adding a new member to the assembly")  // Annotation
    public void addMember(Member member) {
        members.add(member);
    }

    public void addSession(Session session) {
        sessions.add(session);
    }

    public void addBill(Bill bill) {
        bills.add(bill);
    }

    public void displayMembers() {
        for (Member member : members) {
            member.displayInfo();
        }
    }

    public void displaySessions() {
        for (Session session : sessions) {
            session.displayInfo();
        }
    }

    public void displayBills() {
        for (Bill bill : bills) {
            bill.displayInfo();
        }
    }
}
