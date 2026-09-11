public class Day_Eleven_OOP_Project {
    public static void main (String [] args) {
        Resource[] resources = {
            new VM(
                "vm-01",
                "ap-southeast-1",
                6,
                32
            ),
            new Database(
                "db-01",
                "ap-east-03",
                "EBS Storage",
                512
            ),
            new Cluster (
                "AKS-01",
                "ap-west-01",
                8,
                "1.36.3"
            )
        };

        resources[0].start();
        resources[0].deploy();
        resources[0].checkHealth();
        resources[0].displayInfo();
        resources[0].stop();
        resources[0].checkHealth();
        resources[0].displayInfo();

        resources[1].start();
        resources[1].scale();
        resources[1].checkHealth();
        resources[1].displayInfo();
        resources[1].stop();
        resources[1].checkHealth();
        resources[1].displayInfo();

        resources[2].start();
        resources[2].backup();
        resources[2].checkHealth();
        resources[2].displayInfo();
        resources[2].stop();
        resources[2].checkHealth();
        resources[2].displayInfo();
    }
}

public class Resource {
    private String name; 
    private String region;
    private boolean status;

    public Resource (String name, String region) {
        setName(name);
        setRegion(region);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Region: " + region);
        System.out.println("Status: " + status);
    }

    public boolean start() {
        status = true;
        return status;
    }

    public boolean stop() {
        status = false;
        return status;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public boolean isRunning() {
        return status;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String setRegion(String region) {
        this.region = region;
        return region;
    }

    public void deploy() {
        System.out.println("Deploying...");
    }

    public void backup() {
        System.out.println("Backuping...");
    }

    public void scale() {
        System.out.println("Scalling...");
    }

    public void checkHealth() {
        if (isRunning()) {
            System.out.println("Healthy!");
        } else {
            System.out.println("Off!");
        }
    }
}

public class VM extends Resource implements Monitable{
    private String name, region;
    public int cpu, memory;

    public VM (String name, String region, int cpu, int memory) {
        super(name, region);
        this.cpu = cpu;
        this.memory = memory;
    }

    @Override
    public void deploy() {
        System.out.println("Deploying VM with " + cpu + " Cores & " + memory + " GB Memory");
    }
}

public class Database extends Resource implements Monitable{
    private String name, region;
    public String engine;
    public int storage;

    public Database (String name, String region, String engine, int storage) {
        super(name, region);
        this.engine = engine;
        this.storage = storage;
    }

    @Override
    public void backup() {
        System.out.println("DB in Backup " + engine + " Enginer &" + storage + " GB Storage");
    }
}

public class Cluster extends Resource implements Monitable{
    private String name, region;
    public int nodeCount;
    public String kubernetesVersion;

    public Cluster (String name, String region, int nodeCount, String kubernetesVersion) {
        super(name, region);
        this.nodeCount = nodeCount;
        this.kubernetesVersion = kubernetesVersion;
    }
 
    @Override
    public void scale() {
        System.out.println("Kubernetes Scaling: " + nodeCount + " Nodes &" + kubernetesVersion + " with K8s Version");
    }
}

public interface Monitable {
    public void checkHealth();
}

