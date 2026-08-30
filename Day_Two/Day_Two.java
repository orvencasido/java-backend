import java.util.Scanner;

public class Day_Two {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2 = 0;
        String name = "";
        int even = 0;

        System.out.println("Enter a Number: ");
        even = sc.nextInt();
        
        System.out.println(isEven(even));
        

        System.out.println("Please Enter Your Name: ");
        name = sc.next();

        greet(name);

        System.out.println("Enter Num 1: ");
        num1 = sc.nextInt();

        System.out.println("Enter Num 2: ");
        num2 = sc.nextInt();

        System.out.println("Result: " + add(num1, num2));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void greet(String name) {
        System.out.println("Hi There! " + name);
    }

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }
}