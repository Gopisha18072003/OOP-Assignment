class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class PassByValueExample {
    public static void modifyPrimitive(int x) {
        x = x + 10;
    }

    public static void modifyObjectReference(Person person) {
        person.name = "John";
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Before modifying primitive: " + num);
        modifyPrimitive(num);
        System.out.println("After modifying primitive: " + num);

        Person person = new Person("Alice");
        System.out.println("Before modifying object reference: " + person.name);
        modifyObjectReference(person);
        System.out.println("After modifying object reference: " + person.name);
    }
}
