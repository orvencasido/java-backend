import java.util.Scanner;

public class Day_Five_Strings3 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";
        char charCount;
        int counter = 0;

        System.out.println("Input: ");
        word = sc.next();

        System.out.println("What to Count: ");
        charCount = sc.next().charAt(0);

        for (int i = 0; i < word.length(); i++) {
            if (charCount == word.charAt(i)) {
                counter++;
            }
        }

        System.out.println("Count: " + charCount + " = " + counter);
    }
}