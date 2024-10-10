// Member.java
public class Member extends Person {  // Inheritance
    private String constituency;
    private String party;
    private Role role;  // Using Enum for Role

    public Member(String name, String constituency, String party, Role role) {
        super(name);
        this.constituency = constituency;
        this.party = party;
        this.role = role;
    }

    @Override
    public void displayInfo() {  // Polymorphism: Overriding
        super.displayInfo();
        System.out.println("Constituency: " + constituency);
        System.out.println("Party: " + party);
        System.out.println("Role: " + role);
    }
}
