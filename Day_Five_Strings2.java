import java.util.Scanner;

public class Day_Five_Strings2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";
        int counter = 0;

        System.out.print("Enter Word: ");
        word = sc.next();

        for (int i= 0; i < word.length(); i++) {
            if (word.charAt(i).equals("a" || "e" || "i" || "o" || "u")) {
                counter++;
            }
        }

        System.out.print("Count: " + counter);
    }
}