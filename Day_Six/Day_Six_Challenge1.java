public class Day_Six_Challenge1 {
    public static void main (String [] args) {
        int[] array = {45, 12, 78, 34, 90, 23};
        int max, min, ave = 0;

        max = getMaximum(array);
        min = getMinimum(array);
        ave = getAverage(array);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + ave);
    }

    public static int getMaximum(int[] array) {
        int max = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getMinimum(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int getAverage(int[] array) {
        int average, total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        return average = total / array.length;
    }
}