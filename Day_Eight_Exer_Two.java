public class Day_Eight_Exer_Two {
    public static void main (String [] args) {
        Student stud1 = new Student("Orven Casido", 24, 70);
        Student stud2 = new Student("Lenovo Legion", 23, 90);

        stud1.displayInfo();
        System.out.println("Passed? " + stud1.isPassed());

        stud2.displayInfo();
        System.out.println("Passed? " + stud2.isPassed());
    }
}

public class Student {
    String name; 
    int age;
    int score;

    Student (String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public boolean isPassed() {
        boolean checker = true;
        
        if (score > 85) {
            checker = true;
        } else {
            checker = false; 
        }
        return checker;
    }
}