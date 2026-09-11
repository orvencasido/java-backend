public class Day_Eleven_Poly_Example2 {
    public static void main (String [] args) {
        CloudResource vm = new VM();
        CloudResource aks = new AKS();

        vm.start();
        aks.start();
    }
}

public class CloudResource {
    public void start() {
        System.out.println("Starting Cloud Resource...");
    }
}

public class VM extends CloudResource {
    @Override 
    public void start() {
        System.out.println("Starting VM...");
    }
}

public class AKS extends CloudResource {
    @Override
    public void start() {
        System.out.println("Starting AKS...");
    }
}