import java.util.Scanner;

public class Day_Two_Exercise_One_Loops {
    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Enter A Number: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}