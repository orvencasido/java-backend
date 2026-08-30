import java.util.Scanner;

public class Day_Two_Exercise_Eight_PasswordAttempt {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in); 
        String correctPassword = "java123";
        String inputPassword = "";

        for (int i = 2; i >= 0; i--) {
            System.out.print("Enter Password: ");
            inputPassword = sc.next();

            if (inputPassword.equals(correctPassword)) {
                System.out.println("Access Granted "); 
                break;
            } else {
                System.out.println("Invalid Password!\nRemaining Attempt: " + i);
            }
        }
    }
} 