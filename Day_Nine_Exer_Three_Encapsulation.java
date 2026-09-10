public class Day_Nine_Exer_Three_Encapsulation {
    public static void main (String [] args) {
        Employee employee1 = new Employee(
            "Orven Casido",
            "DevOps Engineer",
            100000
        );

        System.out.println(employee1.getName());
        System.out.println(employee1.getPosition());
        System.out.println(employee1.getSalary());

        employee1.setName("Pogi Ako");
        employee1.setPosition("Solutions Architect");
        employee1.setSalary(250000);

        System.out.println(employee1.getName());
        System.out.println(employee1.getPosition());
        System.out.println(employee1.getSalary());
    }
}

public class Employee {
    private String name;
    private String position;
    private int salary;

    Employee (String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public String setName(String newName) {
        name = newName;
        return name;
    }

    public String setPosition(String newPosition) {
        position = newPosition;
        return position;
    }

    public int setSalary(int newSalary) {
        if (newSalary < 0) {
            System.out.println("Salary cant be negative!");
        } else {
            salary = newSalary;
        } return salary;
    }
}