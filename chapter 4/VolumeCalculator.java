public class VolumeCalculator {

    // Method to calculate the volume of a sphere
    public double volume(double r) {
        return (4.0 / 3.0) * (22.0 / 7.0) * r * r * r;
    }

    // Method to calculate the volume of a cylinder
    public double volume(double h, double r) {
        return (22.0 / 7.0) * r * r * h;
    }

    // Method to calculate the volume of a cuboid
    public double volume(double l, double b, double h) {
        return l * b * h;
    }

    public static void main(String[] args) {
        VolumeCalculator calculator = new VolumeCalculator();

        // Calculate and print the volume of a sphere
        double sphereVolume = calculator.volume(5.0); // Example with radius 5.0
        System.out.println("Volume of the sphere: " + sphereVolume);

        // Calculate and print the volume of a cylinder
        double cylinderVolume = calculator.volume(3.0, 4.0); // Example with height 3.0 and radius 4.0
        System.out.println("Volume of the cylinder: " + cylinderVolume);

        // Calculate and print the volume of a cuboid
        double cuboidVolume = calculator.volume(6.0, 7.0, 8.0); // Example with length 6.0, breadth 7.0, and height 8.0
        System.out.println("Volume of the cuboid: " + cuboidVolume);
    }
}
