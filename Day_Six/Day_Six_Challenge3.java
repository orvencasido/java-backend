import java.util.Scanner;

public class Day_Six_Challenge3 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int vowels = 0;
        int consonants = 0;

        System.out.print("Enter Word: ");
        String word = inputWord(sc);

        counter = countChar(word);
        System.out.println("Characters: " + counter);

        vowels = countVowels(word);
        System.out.println("Vowels: " + vowels);

        consonants = countConsonants(word);
        System.out.println("Consonants: " + consonants);
    }

    public static String inputWord (Scanner sc) {
        String word = "";
        word = sc.next();

        return word;
    }

    public static int countChar (String word) {
        return word.length();
    }

    public static int countVowels (String word) {
        int counter = 0;
        
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' ||
                word.charAt(i) == 'e' ||
                word.charAt(i) == 'i' ||
                word.charAt(i) == 'o' ||
                word.charAt(i) == 'u') {
                    counter += 1;
                }
        }
        return counter;
    }

    public static int countConsonants (String word) {
        int counter = 0;
        
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != 'a' ||
                word.charAt(i) != 'e' ||
                word.charAt(i) != 'i' ||
                word.charAt(i) != 'o' ||
                word.charAt(i) != 'u') {
                    counter += 1;
                }
        }
        return counter;
    }
}