public class Day_Eight_Exercise_Four_Methods2 {
    public static void main (String [] args) {
        Student stud1 = new Student();

        stud1.name = "Orbs";
        stud1.age = 53;
        stud1.score = 90;

        stud1.displayInfo();
        System.out.println(stud1.isPassed());
    }
}


public class Student {
    String name = "";
    int age = 0;
    int score = 0;

    public void displayInfo() {
        System.out.print("Name: " + name);
        System.out.print("Age: " + age);
        System.out.print("Score: " + score);
    }

    public boolean isPassed() {
        if (score > 85) {
            return true;
        } else {
            return false;
        } 
    }
}