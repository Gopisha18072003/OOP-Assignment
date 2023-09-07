public class SeriesCalculator {

    // Method to calculate the sum of the first series
    public double series(double n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    // Method to calculate the sum of the second series
    public double series(double a, double n) {
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (a * a + 3 * i);
        }
        return sum;
    }

    public static void main(String[] args) {
        SeriesCalculator calculator = new SeriesCalculator();

        // Calculate and print the sum of the first series
        double sum1 = calculator.series(5); // Example with n = 5
        System.out.println("Sum of the first series: " + sum1);

        // Calculate and print the sum of the second series
        double sum2 = calculator.series(2, 3); // Example with a = 2 and n = 3
        System.out.println("Sum of the second series: " + sum2);
    }
}
