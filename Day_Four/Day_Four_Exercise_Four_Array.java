public class Day_Four_Exercise_Four_Array {
    public static void main (String [] args) {
        int[] num = {20, 40, 50, 70, 90, 99};
        int count = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > 50) {
                count += 1;
            }
        }

        System.out.print("Count > 50: " + count);
    }
}