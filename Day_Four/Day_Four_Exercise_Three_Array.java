public class Day_Four_Exercise_Three_Array {
    public static void main (String [] args) {
        int[] num = {1,2,3,4,5};
        int total = 0;

        for (int i = 0; i < num.length; i++) {
            total += num[i];
        }
        System.out.print("Total: " + total);
    }
}