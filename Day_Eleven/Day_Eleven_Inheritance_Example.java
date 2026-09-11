public class Day_Eleven_Inheritance_Example {
    public static void main (String [] args) {
        Car car1 = new Car();

        car1.start();
        car1.drive();
    } 
} 

public class Vehicle {
    String brand;
    int year;

    public void start() {
        System.out.println("Vehicle Started!");
    }
}

public class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving!");
    }
}
