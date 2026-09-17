import java.util.ArrayList;

public class Day_Eleven_ArrayList_Act5 {
    public static void main (String [] args) {
        ArrayList<String> resources = new ArrayList<>();
        boolean databaseChecker, storageChecker = false;

        resources.add("vm");
        resources.add("database");
        resources.add("cluster");
        resources.add("load balancer");

        databaseChecker = wordChecker(resources, "database1");
        storageChecker = wordChecker(resources, "storage");

        System.out.println("Database Exists: " + databaseChecker);
        System.out.println("Storage Exists: " + storageChecker);
    }

    public static boolean wordChecker(ArrayList<String> resources, String word) {
        boolean checker;
        
        if (resources.contains(word)) {
            checker = true;
        } else {
            checker = false;
        } return checker;
    }
}