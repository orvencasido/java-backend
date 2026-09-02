public class Day_Four_Part_Two_Exercise_One {
    public static void main (String [] args) {
        int[] num = {2,5,7,4};
        int max = 0;
        int min = 0;

        max = findMaximum(num);
        min = findMinimum(num);
    }

    public static int findMaximum(int[] num) {
        int max = num[0];
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
               max = num[i];
            }
            
        } 
        System.out.println("Max: " + max);
        return max;
    } 

    public static int findMinimum(int[] num) {
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.print("Min: " + min);
        return min;
    }
}