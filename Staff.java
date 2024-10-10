
public class Staff extends Person {
    private String position;

    public Staff(String name, String position) {
        super(name);
        this.position = position;
    }

    @Override
    public void displayInfo() {  // Polymorphism: Overriding
        super.displayInfo();
        System.out.println("Position: " + position);
    }
}
