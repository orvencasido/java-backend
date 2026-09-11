public class Day_Eleven_Poly_Exercise2 {
    public static void main (String [] args) {
        Animals[] animals = {
            new Dog(),
            new Cat(),
            new Bird()
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }
    }
}

public class Animals {
    public void makeSound() {
        System.out.println("Make Sound...");
    }
}

public class Dog extends Animals {
    @Override
    public void makeSound() {
        System.out.println("Arf...");
    }
}

public class Cat extends Animals {
    @Override
    public void makeSound() {
        System.out.println("Meow...");
    }
}

public class Bird extends Animals {
    @Override
    public void makeSound() {
        System.out.println("Tweet...");
    }
}