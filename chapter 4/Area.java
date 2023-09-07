public class Area {
    public double calculateArea(float base, float height) {
        return base * height;
    }

    public double calculateArea(double diagonal1, double diagonal2) {
        return 0.5 * diagonal1 * diagonal2;
    }

    public double calculateArea(double sideA, double sideB, double height) {
        return 0.5 * (sideA + sideB) * height;
    }

    public static void main(String[] args) {
        Area areaCalculator = new Area();

        // Calculate the area of a parallelogram
        double parallelogramArea = areaCalculator.calculateArea(5.0f, 10.0f);
        System.out.println("Area of parallelogram: " + parallelogramArea);

        // Calculate the area of a rhombus
        double rhombusArea = areaCalculator.calculateArea(4.0, 6.0);
        System.out.println("Area of rhombus: " + rhombusArea);

        // Calculate the area of a trapezium
        double trapeziumArea = areaCalculator.calculateArea(3, 7, 4);
        System.out.println("Area of trapezium: " + trapeziumArea);
    }
}
