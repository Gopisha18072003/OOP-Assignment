class MyClass {
    // Static Block
    static {
        System.out.println("Static Block 1");
    }

    // Instance Block
    {
        System.out.println("Instance Block 1");
    }

    // Constructor
    MyClass() {
        System.out.println("Constructor");
    }

    // Instance Block
    {
        System.out.println("Instance Block 2");
    }

    // Static Block
    static {
        System.out.println("Static Block 2");
    }
}

public class prog2 {
    public static void main(String[] args) {
        System.out.println("Creating object 1");
        MyClass obj1 = new MyClass();

        System.out.println("\nCreating object 2");
        MyClass obj2 = new MyClass();
    }
}
