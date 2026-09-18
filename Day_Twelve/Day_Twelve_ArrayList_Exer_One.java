import java.util.ArrayList;
import java.util.Scanner;

public class Day_Twelve_ArrayList_Exer_One {
    public static void main (String [] args) {
        ArrayList<String> tools = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int length = 0;

        System.out.print("Enter Length: ");
        length = sc.nextInt();

        for (int i = 0; i < length; i++) {
            tools.add(getTools(sc));
        }

        displayTools(tools);

        // tools.set(4, "Github");
        // tools.remove(3);
        // tools.contains("Kubernetes");

        // displayTools(tools);
    }

    public static void displayTools(ArrayList<String> tools) {
        for (int i = 0; i < tools.size(); i++) {
            System.out.println(tools.get(i));
        }
        System.out.println();
    }

    public static String getTools(Scanner sc) {
        return sc.next();
    }
}