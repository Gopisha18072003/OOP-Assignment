import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + (firstNumber * secondNumber));
        System.out.println("Division: " + (firstNumber / secondNumber));
        input.close();
    }
}