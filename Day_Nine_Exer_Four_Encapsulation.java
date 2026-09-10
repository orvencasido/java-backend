public class Day_Nine_Exer_Four_Encapsulation {
    public static void main (String [] args) {
        Server server1 = new Server(
            "orbs-01",
            "10.10.10.01",
            4,
            8,
            false
        );

        server1.displayInfo();

        server1.startServer();
        server1.displayInfo();
        
        server1.stopServer();
        server1.displayInfo();
    }
}

public class Server {
    private String hostname;
    private String ipAddress;
    private int cpu;
    private int memory;
    private boolean status;

    Server (String hostname, String ipAddress, int cpu, int memory, boolean status) {
        this.hostname = hostname;
        this.ipAddress = ipAddress;
        this.cpu = cpu;
        this.memory = memory;
        this.status = status;
    }

    public String setHostname(String setHost) {
        hostname = setHost;
        return hostname;
    }

    public String getIpAddress(String setIP) {
        ipAddress = setIP;
        return ipAddress;
    }

    public int setCpu(int setCpucores) {
        cpu = setCpucores;
        return cpu;
    }

    public int getMemory(int setMem) {
        memory = setMem;
        return memory;
    }

    public String getHostname() {
        return hostname;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public int getCpu() {
        return cpu;
    }

    public int getMemory() {
        return memory;
    }

    public Boolean getStatus() {
        return status;
    }

    public boolean startServer() {
        status = true;
        return status;
    }

    public boolean stopServer() {
        status = false;
        return status;
    }

    public String isRunning() {
        String statusText;
        if (status = true) {
            statusText = "System is Running";
        } else {
            statusText = "System is Off";
        } return statusText;
    }

    public void displayInfo() {
        System.out.println("Hostname: " + hostname);
        System.out.println("IP Address: " + ipAddress);
        System.out.println("CPU: " + cpu + " Cores");
        System.out.println("Memory: " + memory + " GB");
        System.out.println("Status: " + status);
    }
}