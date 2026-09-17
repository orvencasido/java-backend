import java.util.ArrayList;

public class Day_Eleven_ArrayList_Act3 {
    public static void main (String [] args) {
        ArrayList<String> server = new ArrayList<>();

        server.add("server-01");
        server.add("server-02");
        server.add("server-03");
        server.add("server-04");
        System.out.println(server);

        server.remove(1);
        System.out.println(server);
    }
}