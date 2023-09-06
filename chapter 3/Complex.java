
public class Complex {
    // Data members to store real and imaginary parts
    private float real;
    private float imaginary;

    // Constructor to initialize the complex number
    public Complex() {
        this.real = 0.0f;
        this.imaginary = 0.0f;
    }

    // Setter method to set the specified values in the object
    public void set(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Display the complex number
    public void disp() {
        System.out.println("Complex Number: " + real + " + " + imaginary + "i");
    }

    // Sum two complex numbers and return the result
    public Complex sum(Complex other) {
        Complex result = new Complex();
        result.real = this.real + other.real;
        result.imaginary = this.imaginary + other.imaginary;
        return result;
    }

    // Getter methods to retrieve the real and imaginary parts
    public float getReal() {
        return real;
    }

    public float getImaginary() {
        return imaginary;
    }

    // Main method for testing
    public static void main(String[] args) {
        Complex num1 = new Complex();
        Complex num2 = new Complex();

        num1.set(2.0f, 3.0f);
        num2.set(1.5f, -2.5f);

        num1.disp();
        num2.disp();

        Complex sumResult = num1.sum(num2);
        sumResult.disp();
    }
}

