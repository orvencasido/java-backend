public class Day_Eleven_Inheritance_Act1 {
    public static void main (String [] args) {
        Dog dog1 = new Dog("Dog", 1);
        Cat cat1 = new Cat("Cat", 2);

        dog1.eat();
        dog1.sleep();
        dog1.bark();
        dog1.getAge();

        cat1.eat();
        cat1.sleep();
        cat1.meow();
        cat1.getAge();

        dog1.eat();
        dog1.sleep();
        dog1.bark();
        dog1.getAge();
    }
}

public class Animal {
    String name;
    int age;

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public void getAge() {
        System.out.println(name + ": " + age);
    }
}

public class Dog extends Animal {

    public Dog (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println(name + " Barking!");
    }
}

public class Cat extends Animal {
    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow() {
        System.out.println(name +  " Meowing!");
    }
}