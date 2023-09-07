public class Perimeter {

    // Method to calculate the perimeter of a square
    public double calculatePerimeter(double sideLength) {
        return 4 * sideLength;
    }

    // Method to calculate the perimeter of a rectangle
    public double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Method to calculate the perimeter of a circle
    public double calculatePerimeter(double radius, boolean isCircle) {
        if (isCircle) {
            return 2 * (22.0 / 7.0) * radius;
        } else {
            // This method is overloaded for circle, so if isCircle is false, it defaults to rectangle perimeter.
            // You can add more logic here if needed.
            return -1; // Invalid input or desired behavior.
        }
    }

    public static void main(String[] args) {
        Perimeter calculator = new Perimeter();

        // Calculate and print the perimeter of a square
        double squarePerimeter = calculator.calculatePerimeter(5.0); // Example with side length 5.0
        System.out.println("Perimeter of the square: " + squarePerimeter);

        // Calculate and print the perimeter of a rectangle
        double rectanglePerimeter = calculator.calculatePerimeter(6.0, 4.0); // Example with length 6.0 and width 4.0
        System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);

        // Calculate and print the perimeter of a circle
        double circlePerimeter = calculator.calculatePerimeter(3.0, true); // Example with radius 3.0 and isCircle true
        System.out.println("Perimeter of the circle: " + circlePerimeter);
    }
}
