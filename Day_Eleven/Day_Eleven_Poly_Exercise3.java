public class Day_Eleven_Poly_Exercise3 {
    public static void main (String [] args) {
        Employees[] employee = {
            new Developer(),
            new Manager(),
            new DevOpsEngineer()
        };

        for (int i = 0; i < employee.length; i++) {
            employee[i].work();
        }
    }
}

public class Employees {
    public void work() {
        System.out.println("Working...");
    }
}

public class Developer extends Employees {
    @Override
    public void work() {
        System.out.println("Dev Working...");
    }
}

public class Manager extends Employees {
    @Override
    public void work() {
        System.out.println("Manager Working...");
    }
}

public class DevOpsEngineer extends Employees {
    @Override
    public void work() {
        System.out.println("DevOps Engineer Working...");
    }
}