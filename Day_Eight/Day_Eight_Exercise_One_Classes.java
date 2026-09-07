public class Day_Eight_Exercise_One_Classes {
    public static void main (String [] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "Toyota";
        car1.model = "Vios";
        car1.year = 2025;

        car2.brand = "Hyundai";
        car2.model = "Accent";
        car2.year = 2017;

        System.out.println(car2.brand);
    }
}

public class Car {
    String brand = "";
    String model = "";
    int year = 0;
}