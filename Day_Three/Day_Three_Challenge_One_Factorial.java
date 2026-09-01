import java.util.Scanner;

public class Day_Three_Challenge_One_Factorial {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.print("Enter Number: "); 
        num = sc.nextInt();

        checkFactorial(num);
    }

    public static void checkFactorial(int num) {

        for (int i = num; i > 0; i--) {
            System.out.print(i);
        } 
        System.out.print(" = ");
    }
}