import java.util.Scanner;

public class Day_Two_Exercise_Seven_MultiplicationTable {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.print("Enter A Number: ");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int total = num * i;
            System.out.println(num + " x " + i + " = " + total);            
        }
    }
}
