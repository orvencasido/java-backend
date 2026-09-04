import java.util.Scanner;

public class Day_Five_Strings4 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";

        System.out.print("Input: ");
        word = sc.next();

        System.out.println(reverseString(word));
    }

    public static String reverseString(String word) {   
        String reverse = "";

        for (int i = 0; i < word.length(); i++) {
            reverse += word.charAt(word.length() - 1 - i);
        }   

        return reverse;
    }
}