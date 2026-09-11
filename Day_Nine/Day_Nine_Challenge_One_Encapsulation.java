import java.util.Scanner;

public class Day_Nine_Challenge_One_Encapsulation {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        User user1 = new User (
            "",
            "abc",
            17
        );

        System.out.println("Set Username");
        System.out.println("Name: " + user1.setUsername(sc.next()));

        System.out.println("Set Password");
        System.out.println("Name: " + user1.setPassword(sc.next()));

        System.out.println("Set Age");
        System.out.println("Name: " + user1.setAge(sc.nextInt()));

        System.out.println("New Username: " + user1.getUsername());
        System.out.println("New Password: " + user1.getPassword());
        System.out.println("New Age: " + user1.getAge());

        while (true) {
            if (user1.getUsername == )
        }

    }
}

public class User {
    private String username;
    private String password;
    private int age;

    User (String username, String password, int age) {
        this.username = username;
        this.password = password;
        this.age = age;
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
        if (username == null || username.isBlank()) {
            System.out.println("Username cannot be blank!");
        } else {
            this.username = username;
        }

        return username;
    }

    public String setPassword(String password) {
        if (password.length() < 8 ) {
            System.out.println("Password Must Have atleast 8 Characters!");
        } else {
            this.password = password;
        }

        return password;
    }

    public int setAge(int age) {     
        if (age < 18) {
            System.out.println("Age Cannot be Less Thank 18!");
        } else {
            this.age = age;
        }
      
        return age;
    }
}