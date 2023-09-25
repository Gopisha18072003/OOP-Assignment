class Animal {
    void sound() {
        System.out.println("Sound of Animals, which varies");
    }

    boolean hasLife() {
        return true;
    }

    boolean hasTail() {
        return true;
    }

    int noOfEyes() {
        return 2;
    }

    int noOfLegs() {
        return 4;
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

public class Prob1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Dog:");
        dog.sound();
        System.out.println("Has Life: " + dog.hasLife());
        System.out.println("Has Tail: " + dog.hasTail());
        System.out.println("No. of Eyes: " + dog.noOfEyes());
        System.out.println("No. of Legs: " + dog.noOfLegs());

        System.out.println();

        Tiger tiger = new Tiger();
        System.out.println("Tiger:");
        tiger.sound();
        System.out.println("Has Life: " + tiger.hasLife());
        System.out.println("Has Tail: " + tiger.hasTail());
        System.out.println("No. of Eyes: " + tiger.noOfEyes());
        System.out.println("No. of Legs: " + tiger.noOfLegs());
    }
}
