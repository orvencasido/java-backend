public class Day_Five_Challenge1 {
    public static void main (String [] args) {
        int[] num = {45, 12, 78, 34, 90, 23};

        System.out.println("Maximum: " + findMaximum(num));
        System.out.println("Minimum: " + findMinimum(num));
        System.out.println("Average: " + findAverage(num));
    }

    public static int findMaximum(int[] array) {
        int highest = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > highest) {
                highest = array[i];
            }
        }
        return highest;
    }

    public static int findMinimum(int[] array) {
        int lowest = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowest) {
                lowest = array[i];
            }
        }
        return lowest;
    }

    public static double findAverage(int[] array) {
        double average = 0;
        
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average = average / array.length;
        return average;
    }
}