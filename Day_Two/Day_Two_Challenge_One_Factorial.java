import java.util.Scanner;

public class Day_Two_Challenge_One_Factorial {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.print("Enter Number: ");
        num = sc.nextInt();

        System.out.println(factorialChecker(num));
    }   

    public static int factorialChecker(int num) {
        int total = 1;

        for (int i = num; i > 1; i--) {
            total = total * i;
        } return total;
    }
}