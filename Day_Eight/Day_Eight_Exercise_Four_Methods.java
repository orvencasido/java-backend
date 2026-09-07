public class Day_Eight_Exercise_Four_Methods {
    public static void main (String [] args) {
        Student stud1 = new Student();

        stud1.name = "Orven";
        stud1.age = 24;
        stud1.score = 90;

        stud1.displayInfo(stud1.name, stud1.age, stud1.score);
        System.out.println(Student.isPassed(stud1.score));
    }
}

public class Student {
    String name = "";
    int age = 0;
    int score = 0;

    public static void displayInfo(this.name, this.age, this.score) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
    }

    public static boolean isPassed(this.score) {
        boolean passed = true;
        
        if (this.score < 85) {
            passed = false; 
        } else 
            passed = true;
        return passed;
    }
}