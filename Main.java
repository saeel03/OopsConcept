// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Assembly assembly = new Assembly();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nGoa Legislative Assembly Menu");
            System.out.println("1. Add Member");
            System.out.println("2. Add Session");
            System.out.println("3. Add Bill");
            System.out.println("4. Display Members");
            System.out.println("5. Display Sessions");
            System.out.println("6. Display Bills");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter constituency: ");
                    String constituency = scanner.nextLine();
                    System.out.print("Enter party: ");
                    String party = scanner.nextLine();
                    System.out.print("Enter role (CHIEF_MINISTER, MINISTER, MLA, SPEAKER): ");
                    Role role = Role.valueOf(scanner.nextLine().toUpperCase());
                    Member member = new Member(name, constituency, party, role);
                    assembly.addMember(member);
                    break;
                case 2:
                    System.out.print("Enter session ID: ");
                    String sessionId = scanner.nextLine();
                    System.out.print("Enter date: ");
                    String date = scanner.nextLine();
                    Session session = new Session(sessionId, date);
                    assembly.addSession(session);
                    break;
                case 3:
                    System.out.print("Enter bill ID: ");
                    String billId = scanner.nextLine();
                    System.out.print("Enter bill title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter status: ");
                    String status = scanner.nextLine();
                    Bill bill = new Bill(billId, title, description, status);
                    assembly.addBill(bill);
                    break;
                case 4:
                    assembly.displayMembers();
                    break;
                case 5:
                    assembly.displaySessions();
                    break;
                case 6:
                    assembly.displayBills();
                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
