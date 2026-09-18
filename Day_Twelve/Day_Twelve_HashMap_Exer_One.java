import java.util.HashMap;

public class Day_Twelve_HashMap_Exer_One {
    public static void main (String [] args) {
        HashMap<String, Integer> names = new HashMap<>();

        names.put("orven", 85);
        names.put("pogi", 90);
        names.put("casido", 70);

        for ( String key : names.keySet() ) {
            System.out.println(key + ": " + names.get(key));
        }
    }
}