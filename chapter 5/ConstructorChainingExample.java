public class ConstructorChainingExample {
    private String name;
    private int age;

    // Default constructor
    public ConstructorChainingExample() {
        // Call the parameterized constructor with default values
        this("Unknown", 0);
    }

    // Parameterized constructor with two parameters
    public ConstructorChainingExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Parameterized constructor with one parameter
    public ConstructorChainingExample(String name) {
        // Call the parameterized constructor with one parameter and default age
        this(name, 0);
    }

    // Method to print the details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorChainingExample obj1 = new ConstructorChainingExample();
        ConstructorChainingExample obj2 = new ConstructorChainingExample("Rahul");
        ConstructorChainingExample obj3 = new ConstructorChainingExample("Raj", 25);

        System.out.println("Object 1:");
        obj1.printDetails();

        System.out.println("\nObject 2:");
        obj2.printDetails();

        System.out.println("\nObject 3:");
        obj3.printDetails();
    }
}
