import java.util.Scanner;

class RailwayTicket {
    private String name;
    private String coach;
    private long mobno;
    private int amt;
    private int totalamt;

    // Constructor to initialize data members
    public RailwayTicket() {
        name = "";
        coach = "";
        mobno = 0;
        amt = 0;
        totalamt = 0;
    }

    // Method to accept user input
    public void accept() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter the coach type (First_AC, Second_AC, Third_AC, Sleeper): ");
        coach = scanner.nextLine();

        System.out.print("Enter your mobile number: ");
        mobno = scanner.nextLong();

        System.out.print("Enter the basic ticket amount: ");
        amt = scanner.nextInt();
    }

    // Method to update the ticket amount based on the coach
    public void update() {
        switch (coach) {
            case "First_AC":
                totalamt = amt + 700;
                break;
            case "Second_AC":
                totalamt = amt + 500;
                break;
            case "Third_AC":
                totalamt = amt + 250;
                break;
            case "Sleeper":
                totalamt = amt;
                break;
            default:
                System.out.println("Invalid coach type. Please enter a valid coach.");
        }
    }

    // Method to display ticket details
    public void display() {
        System.out.println("Ticket Details:");
        System.out.println("Name: " + name);
        System.out.println("Coach: " + coach);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Total Amount: " + totalamt);
    }
}

public class Main {
    public static void main(String[] args) {
        RailwayTicket ticket = new RailwayTicket();

        ticket.accept(); // Input user details
        ticket.update(); // Update the ticket amount based on coach
        ticket.display(); // Display ticket details
    }
}
