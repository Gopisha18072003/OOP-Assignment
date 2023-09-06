class Rectangle {
    private float length;
    private float width;

    // Setter methods to set the length and width
    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    // Calculate and return the perimeter of the rectangle
    public float perimeter() {
        return 2 * (length + width);
    }

    // Calculate and return the area of the rectangle
    public float area() {
        return length * width;
    }

    // Display the length and width of the rectangle
    public void show() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    // Check if two rectangles have the same area
    public boolean isSameArea(Rectangle other) {
        return this.area() == other.area();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two rectangle objects
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        // Set the length and width of the first rectangle
        rectangle1.setLength(5);
        rectangle1.setWidth(2.5f);

        // Set the length and width of the second rectangle
        rectangle2.setLength(5);
        rectangle2.setWidth(18.9f);

        // Display information about the first rectangle
        System.out.println("Rectangle 1:");
        rectangle1.show();
        System.out.println("Area: " + rectangle1.area());
        System.out.println("Perimeter: " + rectangle1.perimeter());

        // Display information about the second rectangle
        System.out.println("\nRectangle 2:");
        rectangle2.show();
        System.out.println("Area: " + rectangle2.area());
        System.out.println("Perimeter: " + rectangle2.perimeter());

        // Check if the two rectangles have the same area
        if (rectangle1.isSameArea(rectangle2)) {
            System.out.println("\nThe two rectangles have the same area.");
        } else {
            System.out.println("\nThe two rectangles do not have the same area.");
        }

        // Modify the dimensions of the first rectangle
        rectangle1.setLength(15);
        rectangle1.setWidth(6.3f);

        // Display updated information about the first rectangle
        System.out.println("\nUpdated Rectangle 1:");
        rectangle1.show();
        System.out.println("Area: " + rectangle1.area());
        System.out.println("Perimeter: " + rectangle1.perimeter());

        // Check if the two rectangles have the same area again
        if (rectangle1.isSameArea(rectangle2)) {
            System.out.println("\nThe two rectangles have the same area.");
        } else {
            System.out.println("\nThe two rectangles do not have the same area.");
        }
    }
}
