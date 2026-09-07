public class Day_Eight_Exer_One {
    public static void main (String [] args) {
        Car car1 = new Car("Toyota", "Vios", 2025);
        Car car2 = new Car("Honda", "Civic", 2024);

        car1.displayInfo();
        car2.displayInfo();
    }
}

public class Car {
    String brand;
    String model; 
    int year; 

    Car (String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println();
    }
}