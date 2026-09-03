import java.util.Scanner;

public class Day_Five_Strings2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";
        int counter = 0;

        System.out.print("Enter Word: ");
        word = sc.next();

        for (int i= 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || 
                word.charAt(i) == 'e' || 
                word.charAt(i) == 'i' || 
                word.charAt(i) == 'o' || 
                word.charAt(i) == 'u') {
                counter++;
            }
        }

        System.out.print("Count: " + counter);
    }
}