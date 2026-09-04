import java.util.Scanner;

public class Day_Five_Strings5 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";

        System.out.print("Input: ");
        word = sc.next();

        System.out.print(isPalindrome(word));
    }

    public static String reverseString(String word) {
        String reverse = "";
        
        for (int i = 0; i < word.length(); i++) {
            reverse += word.charAt(word.length() - 1 - i); 
        }

        return reverse;
    }

    public static boolean isPalindrome(String word) {
        boolean checker = true;

        for (int i = 0; i < word.length(); i++) {
            if (word.equals(reverseString(word))) {
                checker = true;
            } else {
                checker = false;
            }
        }
        
        return checker;
    }
}