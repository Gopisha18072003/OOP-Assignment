import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc;
        sc =  new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        sc.close();
    }
}