class Vehicle {
    int maxSpeed = 100;
}

class Car extends Vehicle {
    int maxSpeed = 140;

    void display() {
        System.out.println("My parent's speed was: " + super.maxSpeed + " KM/H");
        System.out.println("My Speed is: " + maxSpeed + " KM/H");
    }
}

public class Prob2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
    }
}
