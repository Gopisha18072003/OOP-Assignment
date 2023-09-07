public class Rectangle {
    private double length;
    private double breadth;

    // Constructor with no parameters
    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    // Constructor with two numbers as parameters
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Constructor with one number as a parameter
    public Rectangle(double side) {
        this.length = side;
        this.breadth = side;
    }

    // Method to calculate the area
    public double calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        // Create objects of the Rectangle class
        Rectangle rectangle1 = new Rectangle();                  // No parameters
        Rectangle rectangle2 = new Rectangle(5.0, 3.0);          // Two parameters
        Rectangle rectangle3 = new Rectangle(4.0);               // One parameter

        // Calculate and print the areas of the rectangles
        System.out.println("Area of rectangle1: " + rectangle1.calculateArea());
        System.out.println("Area of rectangle2: " + rectangle2.calculateArea());
        System.out.println("Area of rectangle3: " + rectangle3.calculateArea());
    }
}
