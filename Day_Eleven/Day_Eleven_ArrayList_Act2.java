import java.util.ArrayList;

public class Day_Eleven_ArrayList_Act2 {
    public static void main (String [] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(30);
        System.out.println(num);

        num.set(1, 25);
        System.out.println(num);
    }
}