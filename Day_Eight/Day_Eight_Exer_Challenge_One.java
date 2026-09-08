public class Day_Eight_Exer_Challenge_One {
    public static void main (String [] args) {
        Car car1 = new Car();

        car1.brand = "String";
        car1.model = "Vios";
        car1.year = 2025;

        System.out.println("Brand: " + car1.brand);
        System.out.println("Model: " + car1.model);
        System.out.println("Year: " + car1.year);
    }
}

public class Car {
    String brand;
    String model;
    int year;
}