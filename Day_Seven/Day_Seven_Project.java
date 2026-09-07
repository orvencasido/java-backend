import java.util.Scanner;

public class Day_Seven_Project {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int numberStudent, userInput, highestScores, lowestScores, average, findScore = 0;
        boolean scoreFinder = true;
        int[] scores = new int[0];

        System.out.print("Enter Number of Students: ");
        numberStudent = studentNumber(sc);

        //fetch score
        scores = getScore(sc, numberStudent);

        while(true) {
            System.out.println("1. Display Score");
            System.out.println("2. Find Highest Score");
            System.out.println("3. Find Lowest Score");
            System.out.println("4. Calculate Average Score");
            System.out.println("5. Reverse Scores");
            System.out.println("6. Search for Score");
            System.out.println("7. String Analysis");
            System.out.println("8. Exit");
            System.out.print("Enter Choice: ");
            userInput = sc.nextInt();

            if (userInput == 1) {
                // display score
                System.out.println(displayScore(scores, numberStudent));
            } else if (userInput == 2) {
                // highest score
                highestScores = highestScore(scores);
                System.out.println("Highest Score: " + highestScores);
            } else if (userInput == 3) {
                // lowest score
                lowestScores = lowestScore(scores);
                System.out.println("Lowest Score: " + lowestScores);
            } else if (userInput == 4) {
                // average score
                average = calculateAverage(scores);
                System.out.println("Average: " + average);
            } else if (userInput == 5) {
                // display reverse score
                System.out.println(reverseScores(scores));
            } else if (userInput == 6) {
                // search score
                System.out.print("Please Enter Score to find: ");
                findScore = sc.nextInt();
                scoreFinder = searchScore(scores, findScore);
                System.out.println(scoreFinder);
            } else if (userInput == 7) {
                String word, reversed = "";
                int wordLength = 0;
                boolean checkerPalindrome = true;

                System.out.print("Enter a word: ");
                word = getWord(sc);

                reversed = reversedWord(word);
                System.out.println("Reversed: " + reversed);

                wordLength = countChar(word);
                System.out.println("Characters: " + wordLength);

                checkerPalindrome = palindromeChecker(word);
                System.out.println("palindrome: " + checkerPalindrome);
            } else if (userInput == 8) {
                //exit
                System.out.println("Thank you!");
                break; 
            } else {
                //fallback
                System.out.println("Enter Valid Number!");
                continue;
            }
        }
    }

    public static boolean palindromeChecker (String word) {
        boolean checker = true;
        
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
                checker = true;
            } else {
                checker = false;
            }
        }
        return checker;
    }

    public static String getWord(Scanner sc) {
        return sc.next();
    }

    public static int countChar(String word) {
        return word.length();
    }

    public static String reversedWord(String word) {
        String reversed = "";
        
        for (int i = 0; i < word.length(); i++) {
            reversed += word.charAt(word.length() - i - 1);
        }
        return reversed;
    }

    public static int studentNumber(Scanner sc) {
        return sc.nextInt();
    }

    public static int[] getScore(Scanner sc, int numberStudent) {
        int[] scores = new int[numberStudent];
        
        for (int i = 0; i < numberStudent; i++) {
            System.out.print("Enter Score for Student " + (i+1) + ": ");
            scores[i] = sc.nextInt();
        }
        return scores;
    }

    public static String displayScore(int[] scores, int numberStudent) {
        String printScores = "";
    
        for (int i = 0; i < numberStudent; i++) {
            if (i == (numberStudent - 1)) {
                printScores += (scores[i]);
            } else {
                printScores += (scores[i]) + ", ";
            }
        }

        return printScores;
    }

    public static int highestScore(int[] scores) {
        int highestScore = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highestScore) {
                highestScore = scores[i];
            }
        }
        return highestScore;
    }

    public static int lowestScore(int[] scores) {
        int lowestScore = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < lowestScore) {
                lowestScore = scores[i];
            }
        }
        return lowestScore;
    }

    public static int calculateAverage(int[] scores) {
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        return total / scores.length;
    }

    public static String reverseScores(int[] scores) {
        String reverse = ""; 

        for (int i = 0; i < scores.length; i++) {
            if (i == scores.length -1) {
                reverse += (scores[scores.length - 1 - i]);
            } else {
                reverse += (scores[scores.length - 1 - i]) + ", "; 
            }
        }
        return reverse;
    }

    public static boolean searchScore(int[] scores, int targetScore) {
        boolean correctScore = true;
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == targetScore) {
                correctScore = true;
            } else {
                correctScore = false;
            }
        }
        return correctScore;
    }
}