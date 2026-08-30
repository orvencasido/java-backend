import java.util.Scanner;

public class Day_Two_Exercise_Five_SumCalculator {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int total = 0;

        System.out.print("Enter A Number: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            total += i;
        }        
        System.out.println("Total: " + total);
    }
}