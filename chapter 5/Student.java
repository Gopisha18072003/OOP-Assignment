public class Student {
    private String name;

    // Constructor with default name "Unknown"
    public Student() {
        this.name = "Unknown";
    }

    // Constructor with a parameter for specifying the name
    public Student(String name) {
        this.name = name;
    }

    // Method to get the student's name
    public String getName() {
        return name;
    }

    // Method to set the student's name
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // Create a student with the default name "Unknown"
        Student student1 = new Student();

        // Create a student with a specified name
        Student student2 = new Student("Alice");

        // Print the names of the students
        System.out.println("Student 1 name: " + student1.getName());
        System.out.println("Student 2 name: " + student2.getName());

        // Change the name of student1
        student1.setName("Bob");

        // Print the updated name of student1
        System.out.println("Updated Student 1 name: " + student1.getName());
    }
}
