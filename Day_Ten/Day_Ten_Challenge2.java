import java.util.Scanner;

public class Day_Ten_Challenge2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        User user1 = new User(
            "default",
            "1234",
            24
        );

        System.out.println("Username: " + user1.getUsername());
        System.out.println("Password: " + user1.getPassword());
        System.out.println("Age: " + user1.getAge());   

        System.out.print("Enter Username: ");
        user1.setUsername(sc.next());

        System.out.print("Enter Password: ");
        user1.setPassword(sc.next());

        System.out.print("Enter Age: ");
        user1.setAge(sc.nextInt());

        System.out.println("Username: " + user1.getUsername());
        System.out.println("Password: " + user1.getPassword());
        System.out.println("Age: " + user1.getAge());
    }
}

public class User {
    private String username;
    private String password;
    private int age;

    public User (String username, String password, int age) {
        setUsername(username);
        setPassword(password);
        setAge(age);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String setUsername(String username) {
        if (username == null || username.isBlank()){
            System.out.println("Username cannot be null!");
        } else {
            this.username = username;
        }
        return username;
    }

    public String setPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Password should not be Less Than 8 Characters!");
        } else {
            this.password = password;
        }
        return password;
    }

    public int setAge(int age) {
        if (age < 18) {
            System.out.println("Age 18 Below is not allowed!");
        } else {
            this.age = age;
        }
        return age;
    }
} 