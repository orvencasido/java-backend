import java.util.HashSet;

public class Day_Twelve_HashSet_Exer_One {
    public static void main (String [] args) {
        HashSet<String> ip = new HashSet<>();

        ip.add("192.168.1.1");
        ip.add("192.168.1.2");
        ip.add("192.168.1.1");
        ip.add("10.0.0.1");
        ip.add("10.0.0.1");

        System.out.println(ip);
        System.out.println(ip.size());
        System.out.println(ip.contains("10.0.0.2"));
    }
}