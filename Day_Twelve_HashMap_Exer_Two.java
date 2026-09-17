import java.util.HashMap;

public class Day_Twelve_HashMap_Exer_Two {
    public static void main (String [] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("orven", 60);
        scores.put("casido", 70);
        scores.put("palmaria", 80);
        scores.put("pogi", 90);
        scores.put("haha", 100);

        for ( String key : scores.keySet() ) {
            System.out.println(key + ": " + scores.get(key));
        }

        scores.put("orven", 120);
        scores.remove("haha");

        for ( String key : scores.keySet() ) {
            System.out.println(key + ": " + scores.get(key));
        }
    }
}