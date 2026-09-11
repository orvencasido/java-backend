public class Day_Eleven_Abtraction_Challenge {
    public static void main (String [] args) {
        Deployable[] deploy = {
            new KubernetesDeployment(),
            new DockerDeployment(),
            new ServerDeployment()
        };

        for (int i = 0; i < deploy.length; i++) {
            deploy[i].deploy();
            deploy[i].rollback();
        }
    }
}

public interface Deployable {
    public void deploy();
    public void rollback();
}

public class KubernetesDeployment implements Deployable {
    @Override
    public void deploy() {
        System.out.println("Deploying Kubernetes...");
    };

    @Override
    public void rollback() {
        System.out.println("Rollbacking Kubernetes...");
    };
}

public class DockerDeployment implements Deployable {
    @Override
    public void deploy() {
        System.out.println("Deploying Docker...");
    };

    @Override
    public void rollback() {
        System.out.println("Rollbacking Docker...");
    };
}

public class ServerDeployment implements Deployable {
    @Override
    public void deploy() {
        System.out.println("Deploying Server...");
    };

    @Override
    public void rollback() {
        System.out.println("Rollbacking Server...");
    };
}
