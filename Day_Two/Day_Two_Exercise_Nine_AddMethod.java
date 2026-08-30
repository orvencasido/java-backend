import java.util.Scanner;

public class Day_Two_Exercise_Nine_AddMethod {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2 = 0;

        System.out.print("Num 1: ");
        num1 = sc.nextInt();

        System.out.print("Num 2: ");
        num2 = sc.nextInt();

        System.out.println("Total: " + addNum(num1, num2));
    } 

    public static int addNum (int num1, int num2) {
        return num1 + num2;
    }
}