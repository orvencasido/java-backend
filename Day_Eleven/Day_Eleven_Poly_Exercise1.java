public class Day_Eleven_Poly_Exercise1 {
    public static void main (String [] args) {
        
        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Bird(),
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }
    }
}

public class Animal {
    public void makeSound() {
        System.out.println("Animal Sound...");
    }
}

public class Dog extends Animal{
    @Override 
    public void makeSound() {
        System.out.println("Arf...");
    }
}

public class Cat extends Animal{
    @Override 
    public void makeSound() {
        System.out.println("Meow...");
    }
}

public class Bird extends Animal{
    @Override 
    public void makeSound() {
        System.out.println("Tweet...");
    }
}