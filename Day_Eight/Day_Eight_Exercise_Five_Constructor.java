public class Day_Eight_Exercise_Five_Constructor {
    public static void main (String [] args) {
        Product prod1 = new Product("Alaska", 35, 5);

        prod1.displayProduct();
    }
}

public class Product {
    String name = "";
    int price = 0;
    int quantity = 0;

    Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProduct() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}