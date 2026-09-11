public class Day_Eleven_Inheritance_Act2 {
    public static void main (String [] args) {

        Developer developer1 = new Developer(
            "Orven Casido",
            30000,
            "Java"
        );

        Manager manager1 = new Manager(
            "Adrianne Lagustan",
            60000,
            2
        );

        developer1.displayInfo();
        developer1.code();

        manager1.displayInfo();
        manager1.manage();
    }
}

public class Employee {
    String name; 
    int salary;

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Developer extends Employee {
    String programmingLanguage;
    
    public Developer (String name, int salary, String programmingLanguage) {
        this.name = name;
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
    }

    public void code() {
        System.out.println("Coding..." + programmingLanguage);
    }
}

public class Manager extends Employee {
    int teamSize;

    public Manager (String name, int salary, int teamSize) {
        this.name = name;
        this.salary = salary;
        this.teamSize = teamSize;
    }

    public void manage() {
        System.out.println("Managing..." + teamSize + " Team Size");
    }
}