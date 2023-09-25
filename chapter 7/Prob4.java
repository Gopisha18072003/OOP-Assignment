class Animal {
    void sound() {
        System.out.println("Sound of Animals, which varies");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Barking");
    }
}

class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("Roaring");
    }
}

public class Prob4 {
    public static void main(String[] args) {
        char choice;
        do {
            System.out.println("Enter 'D' for Dog, 'T' for Tiger, or 'E' to Exit:");
            choice = Character.toUpperCase(System.console().readLine().charAt(0));

            switch (choice) {
                case 'D':
                    Animal dog = new Dog();
                    dog.sound();
                    break;
                case 'T':
                    Animal tiger = new Tiger();
                    tiger.sound();
                    break;
                case 'E':
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'D', 'T', or 'E'.");
            }
        } while (choice != 'E');
    }
}
