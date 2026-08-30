import java.util.Scanner;

public class Day_Two_Exercise_Two_Countdown {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.print("Enter a Number: ");
        num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.println(i);   
        }
    }
}