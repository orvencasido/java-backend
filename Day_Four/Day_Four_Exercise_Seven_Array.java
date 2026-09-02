public class Day_Four_Exercise_Seven_Array {
    public static void main (String [] args) {
        int[] num = {6,2,3,4,5,0};
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Min: " + min);
    }
}