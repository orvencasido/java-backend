public class Day_Eight_Exer_Six {
    public static void main (String [] args) {
        Laptop laptop1 = new Laptop("Lenovo", "Thinkpad", 8, 256);

        laptop1.upgradeRam(16);
        laptop1.displayInfo();
    }
}

public class Laptop {
    String brand;
    String model;
    int ram;
    int storage;

    Laptop (String brand, String model, int ram, int storage) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
    } 

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Ram: " + upgradeRam(ram));
        System.out.println("Storage: " + storage);
    }

    public int upgradeRam(int totalRam) {
        ram = totalRam;
        return ram;
    }
}