import java.util.ArrayList;

public class generatePrime {

    public static void main(String[] args) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }
    }

    private static boolean isPrime(int number) {
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
}