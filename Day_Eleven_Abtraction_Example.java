public class Day_Eleven_Abtraction_Example {
    public static void main (String [] args) {
        Flyable[] fly = {
            new Bird(),
            new Airplane()
        };

        fly[0].fly();
        fly[1].fly();
    }
}

public interface Flyable {
    public void fly();
} 

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird Flying...");
    }
}

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane Flying...");
    }
}