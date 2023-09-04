public class oddNumber {

    public static void main(String[] args) {
        // Print the odd numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}