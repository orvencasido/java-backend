import java.util.ArrayList;

public class Day_Eleven_ArrayList_Example {
    public static void main (String [] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Orven");
        names.add("Giannis");
        names.add("Curry");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
} 

