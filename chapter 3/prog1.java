class Car
{
    String color;
    int maxSpeed;
    void initialize(String color, int maxSpeed )
    {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void show()
    {
        System.out.println("Color of my car is "+ color);
        System.out.println("Maximum Speed of my car is "+ maxSpeed + "km/hr");
    }
}

public class prog1 {
    public static void main(String args[])
    {
        Car c = new Car();
        c.initialize("Blue", 250);
        c.show();

    }
    
}
