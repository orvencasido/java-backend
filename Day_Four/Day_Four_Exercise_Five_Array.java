public class Day_Four_Exercise_Five_Array {
    public static void main (String [] args) {
        int[] num = {1,2,4,5,6,7,8,9,10};
        double total = 0;
        double average = 0;

        for (int i = 0; i < num.length; i++) {
            total += num[i];
        } 

        average = (total / num.length);
        System.out.print("Average: " + average);
    }
}