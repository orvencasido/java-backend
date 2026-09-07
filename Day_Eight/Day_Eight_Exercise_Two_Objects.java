public class Day_Eight_Exercise_Two_Objects {
    public static void main (String [] args) {
        Student orven = new Student();

        orven.name = "Orven";
        orven.section = "Integrity";
        orven.year = 4;

        System.out.println("Name: " + orven.name);
        System.out.println("Section: " + orven.section);
        System.out.println("Year: " + orven.year);
    }
}

public class Student {
    String name = "";
    String section = "";
    int year = 0;
}