import java.util.Scanner;

class ParkingLot {
    private int vno;
    private int hours;
    private double bill;

    // Method to input vehicle number and hours
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter vehicle number: ");
        vno = scanner.nextInt();

        System.out.print("Enter the number of hours parked: ");
        hours = scanner.nextInt();
    }

    // Method to calculate parking charge
    public void calculate() {
        double firstHourCharge = 3.0;
        double additionalHourCharge = 1.5;

        if (hours <= 1) {
            bill = firstHourCharge;
        } else {
            bill = firstHourCharge + (additionalHourCharge * (hours - 1));
        }
    }

    // Method to display details
    public void display() {
        System.out.println("Parking Lot Details:");
        System.out.println("Vehicle Number: " + vno);
        System.out.println("Hours Parked: " + hours);
        System.out.println("Parking Charge: Rs." + bill);
    }
}

public class Main1 {
    public static void main(String[] args) {
        ParkingLot parking = new ParkingLot();

        parking.input(); // Input vehicle number and hours
        parking.calculate(); // Calculate parking charge
        parking.display(); // Display parking details
    }
}
