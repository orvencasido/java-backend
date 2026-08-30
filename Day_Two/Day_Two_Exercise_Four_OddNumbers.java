public class Day_Two_Exercise_Four_OddNumbers {
    public static void main (String [] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    } 
}