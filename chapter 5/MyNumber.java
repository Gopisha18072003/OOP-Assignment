

public class MyNumber {
    private double number;

    // Constructor
    public MyNumber(double number) {
        this.number = number;
    }

    // Method to check if the number is zero
    public boolean isZero() {
        return number == 0;
    }

    // Method to check if the number is positive
    public boolean isPositive() {
        return number > 0;
    }

    // Method to check if the number is negative
    public boolean isNegative() {
        return number < 0;
    }

    // Method to check if the number is odd
    public boolean isOdd() {
        return number % 2 != 0;
    }

    // Method to check if the number is even
    public boolean isEven() {
        return number % 2 == 0;
    }

    // Method to check if the number is prime
    public boolean isPrime() {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if the number is Armstrong
    public boolean isArmstrong() {
        int n = (int) number;
        int temp = n;
        int digits = (int) Math.log10(n) + 1;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }

    // Method to calculate the factorial of the number
    public double getFactorial() {
        int n = (int) number;
        double factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Method to calculate the square root of the number
    public double getSqrt() {
        return Math.sqrt(number);
    }

    // Method to calculate the square of the number
    public double getSqr() {
        return number * number;
    }

    // Method to calculate the sum of the digits of the number
    public double sumDigits() {
        int n = (int) Math.abs(number);
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Method to get the reverse of the number
    public double getReverse() {
        long n = (long) number;
        long reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return reverse;
    }

    // Method to list factors and display binary equivalent
    public void listFactor() {
        int n = (int) number;
        System.out.println("Factors of " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nBinary equivalent of " + n + ": " + Long.toBinaryString((long) number));
    }

    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(25);

        System.out.println("Is Zero: " + myNumber.isZero());
        System.out.println("Is Positive: " + myNumber.isPositive());
        System.out.println("Is Negative: " + myNumber.isNegative());
        System.out.println("Is Odd: " + myNumber.isOdd());
        System.out.println("Is Even: " + myNumber.isEven());
        System.out.println("Is Prime: " + myNumber.isPrime());
        System.out.println("Is Armstrong: " + myNumber.isArmstrong());
        System.out.println("Factorial: " + myNumber.getFactorial());
        System.out.println("Square Root: " + myNumber.getSqrt());
        System.out.println("Square: " + myNumber.getSqr());
        System.out.println("Sum of Digits: " + myNumber.sumDigits());
        System.out.println("Reverse: " + myNumber.getReverse());
        myNumber.listFactor();
    }
}
