import java.util.ArrayList;

public class Day_Eleven_ArrayList_Act4 {
    public static void main (String [] args) {
        ArrayList<String> services = new ArrayList<>();
        boolean dockerChecker = false;

        services.add("jenkins");
        services.add("argocd");
        services.add("grafana");
        services.add("prometheus");

        System.out.println(services);

        services.remove("grafana");
        System.out.println(services);
        
        if (services.contains("docker")) {
            dockerChecker = true;
        } else {
            dockerChecker = false;
        } 

        System.out.println(services);
        System.out.println("Docker Checker: " + dockerChecker);
    }
}