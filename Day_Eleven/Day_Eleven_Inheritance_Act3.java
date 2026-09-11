public class Day_Eleven_Inheritance_Act3 {
    public static void main (String [] args) {
        Car car1 = new Car(
            "toyota",
            2025
        );

        Truck truck1 = new Truck(
            "hyundai",
            2024
        );

        Motorcycle motorycle1 = new Motorcycle(
            "honda",
            2023
        );

        car1.displayInfo();
        car1.start();
        car1.car();

        truck1.displayInfo();
        truck1.start();
        truck1.truck();

        motorycle1.displayInfo();
        motorycle1.start();
        motorycle1.motorcycle();
    }
} 

public class Vehicle {
    String brand;
    int year;

    public void start() {
        System.out.println("Starting...");
    }

    public void displayInfo() {
        System.out.println(brand);
        System.out.println(year);
    }
}

public class Car extends Vehicle {
    public Car (String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void car() {
        System.out.println("car is driving...");
    }
}

public class Truck extends Vehicle {
    public Truck (String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void truck() {
        System.out.println("truck is driving...");
    }
}

public class Motorcycle extends Vehicle {
    public Motorcycle (String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void motorcycle() {
        System.out.println("motorycle is driving...");
    }
}