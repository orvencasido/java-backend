import java.util.Scanner;

public class Day_Three_Challenge_One_Factorial2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.print("Enter Number: ");
        num = sc.nextInt();

        factorialChecker(num);
    }

    public static void factorialChecker(int num) {
        int i;
        int total = 1;

        for (i = num; i > 0; i--) {
            total = total * i;

            if (i == 1) {
                System.out.print(i + "=");
            } else System.out.print(i + "*");
        } 
        System.out.println(total);
    }
}