public class Day_Eleven_Poly_Example {
    public static void main (String [] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}

public class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Arf!");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}