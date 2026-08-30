import java.util.Scanner;

public class Day_Two_Exercise_Eleven_AgeCheckerMethod {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;

        System.out.print("Enter Age: ");
        age = sc.nextInt();

        System.out.println(ageChecker(age));
    }

    public static String ageChecker(int age) {
        if (age >= 0 && age <= 12) {
            return "Child";
        } else if (age >= 13 && age <= 17) {
            return "Teenager";
        } else if (age >= 18 && age <= 59) {
            return "Adult";
        } else if (age >= 60 && age <= 120) {
            return "Senior";
        } else {
            return "Invalid Age!";
        }
    }
}