import java.util.Scanner; 

public class Day_Two_Exercise_Ten_MaximumNumber {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.print("Enter a Number 1: ");
        num1 = sc.nextInt();

        System.out.print("Enter a Number 2: ");
        num2 = sc.nextInt();

        System.out.println("Max Number is: " + getMax(num1, num2));
    }

    public static int getMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}