import java.util.ArrayList;

public class Day_Eleven_ArrayList_Act1 {
    public static void main (String [] args) {
        ArrayList<Integer> numbers= new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers);
        System.out.println("First Number: " + numbers.get(0));
        System.out.println("Last Number: " + numbers.get(numbers.size()-1));
        System.out.println("Total Number: " + numbers.size());
    }
}