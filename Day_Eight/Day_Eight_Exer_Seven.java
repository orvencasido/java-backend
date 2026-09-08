public class Day_Eight_Exer_Seven {
    public static void main (String [] args) {
        Server server1 = new Server(
            "prod-server-01",
            "10.0.0.10",
            8,
            32,
            false
        );

        server1.startServer();
        server1.displayInfo();

        System.out.print("Server Running: " + server1.isRunning());
    }
}

public class Server {
    String hostname;
    String ipAddress;
    int cpu;
    int memory;
    boolean status;

    Server (String hostname, String ipAddress, int cpu, int memory, boolean status) {
        this.hostname = hostname;
        this.ipAddress = ipAddress;
        this.cpu = cpu;
        this.memory = memory;
        this.status = status;
    }

    public void displayInfo() {
        System.out.println("Hostname: " + hostname);
        System.out.println("IP Address: " + ipAddress);
        System.out.println("CPU: " + cpu + " Cores");
        System.out.println("Memory: " + memory);
    }

    public boolean startServer() {
        status = true;
        return status;
    }

    public boolean stopServer() {
        status = false;
        return status;
    }

    public boolean isRunning() {
        return status;
    }
}