public class Day_Nine_Exer_One_Encapsulation {
    public static void main (String [] args) {
        Work work1 = new Work("Orven Casido", 25);

        work1.setName("orbs");
        System.out.println(work1.getName());
    }
}

public class Work {
    private String name;
    int num;

    Work (String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String setName(String setName) {
        if (setName.equals("orbs")) {
            System.out.println("Not Allowed!");
        } else {
            name = setName;
        } return setName;
    }

    public String getName() {
        return name;
    }
}