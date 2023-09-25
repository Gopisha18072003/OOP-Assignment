class Person {
    void message() {
        System.out.println("This is person class");
    }
}

class Student extends Person {
    void message() {
        System.out.println("This is student class");
    }

    // Note that display() is only in the Student class
    void display() {
        super.message();
    }
}

public class Prob3 {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("My parent's Message was");
        student.message(); // Calls the overridden method in Student class

        System.out.println("My Message Is");
        student.display();// Calls the superclass method using super keyword
    }
}
