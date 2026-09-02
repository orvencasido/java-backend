public class Day_Four_Exercise_Six_Array {
    public static void main (String [] args) {
        int[] num = {156,5,3,6,8,100};
         

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }

        System.out.print("Max is: " + max);
    }
}