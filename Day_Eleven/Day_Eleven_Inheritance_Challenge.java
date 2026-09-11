public class Day_Eleven_Inheritance_Challenge {
    public static void main (String [] args) {
        Vm vm1 = new Vm(6, 32, "vm-01", "us-east-01");
        AKS aks1 = new AKS(8, "AKS-01", "us-southewest-01");
        DataBase db1 = new DataBase("Block Storage", 512, "EBS-01", "us-southewest-01");

        vm1.vmInfo();
        vm1.start();
        vm1.stop();

        aks1.AKSInfo();
        aks1.start();
        aks1.stop();

        db1.databaseInfo();
        db1.start();
        db1.stop();
    }
}

public class CloudResource{
    String name;
    String region;

    public void start() {
        System.out.println("Resource has started...");
    }

    public void stop() {
        System.out.println("Resource has stopped...");
    }
}

public class Vm extends CloudResource {
    int cpu, memory;

    public Vm (int cpu, int memory, String name, String region) {
        this.cpu = cpu;
        this.memory = memory;
        this.name = name;
        this.region = region;
    } 

    public void vmInfo() {
        System.out.println("CPU: " + cpu + " Cores");
        System.out.println("Memory: " + memory + " GB");
        System.out.println("Name: " + name);
        System.out.println("Region: " + region);
    }
}

public class AKS extends CloudResource {
    int nodeCount;

    public AKS (int nodeCount, String name, String region) {
        this.nodeCount = nodeCount;
        this.name = name;
        this.region = region;
    }

    public void AKSInfo() {
        System.out.println("Node Count: " + nodeCount);
        System.out.println("Name: " + name);
        System.out.println("Region: " + region);
    }
}

public class DataBase extends CloudResource {
    String engine;
    int storage;

    public DataBase (String engine, int storage, String name, String region) {
        this.engine = engine;
        this.storage = storage;
        this.name = name;
        this.region = region;
    }

    public void databaseInfo() {
        System.out.println("Engine: " + engine);
        System.out.println("Storage Size: " + storage + " GB");
        System.out.println("Name: " + name);
        System.out.println("Region: " + region);
    }
}