import java.util.ArrayList;

public class Day_Eleven_ArrayList_Act6 {
    public static void main (String [] args) {
        ArrayList<String> alerts = new ArrayList<>();
        boolean checkerArray;

        checkerArray = checker(alerts);
        System.out.println("Initially Empty: " + checkerArray);

        alerts.add("high cpu usage");
        checkerArray = checker(alerts);
        System.out.println("After Adding: " + checkerArray);

        alerts.clear();
        checkerArray = checker(alerts);
        System.out.println("After Removing: " + checkerArray);
    }

    public static boolean checker(ArrayList<String> alerts) {
        boolean checker;

        if (alerts.isEmpty()) {
            checker = true;
        } else {
            checker = false;
        }

        return checker;
    }
}