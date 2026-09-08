public class Day_Eight_Exer_Five {
    public static void main (String [] args) {
        Employee employee1 = new Employee("Orven Casido", "DevOps Engineer", 30000);
        
        employee1.displayInfo();
        System.out.println(employee1.getAnnualSalary());
    }
}

public class Employee {
    String name;
    String position;
    int salary; 

    Employee (String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
        System.out.println("Anual Salary:" + getAnnualSalary());
    }

    public int getAnnualSalary() {
        return salary * 12;
    }
}