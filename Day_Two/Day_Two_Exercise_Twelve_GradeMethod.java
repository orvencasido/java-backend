import java.util.Scanner;

public class Day_Two_Exercise_Twelve_GradeMethod {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double grade = 0;

        System.out.print("Enter Grade: ");
        grade = sc.nextDouble();

        System.out.println("Your Grade is: " + getGrade(grade));
    }

    public static char getGrade(double grade) {
        if (grade >= 95 && grade <= 100) {
            return 'A';
        } else if (grade >= 85 && grade <= 94) {
            return 'B';
        } else if (grade >= 75 && grade <= 84) {
            return 'C';
        } else if (grade >= 65 && grade <= 74) {
            return 'D';
        } else if (grade <= 64) {
            return 'F';
        } else {
            return 'G';
        }
    } 
}