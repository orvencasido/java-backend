import java.util.Scanner;

public class Day_Three_Challenge_Two_NumberGuessingGame {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int secretNumber = 7;

        while (num != secretNumber) {
            System.out.print("Guess the Number: ");
            num = sc.nextInt();
            
            if (num > secretNumber) {
                System.out.println("Too High!");
            } else if (num < secretNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Correct!");
                break;
            }
        }
    }
}