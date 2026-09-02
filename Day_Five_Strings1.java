import java.util.Scanner;

public class Day_Five_Strings1 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = "";

        System.out.print("Input: ");
        userInput = sc.next();

        for (int i = 0; i < userInput.length(); i++) {
            System.out.println(userInput.charAt(i));
        }
    }
}