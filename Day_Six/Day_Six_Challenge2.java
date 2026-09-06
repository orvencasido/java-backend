import java.util.Scanner;

public class Day_Six_Challenge2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        array = getArray(sc);
        System.out.println("Highest: " + getHighest(array));
        System.out.println("Lowest: " + getLowest(array));
        System.out.println("Average: " + getAverage(array));
        System.out.println("Passed: " + passCounter(array));
        System.out.println("Failed: " + failCounter(array));
    }

    public static int[] getArray(Scanner sc) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Get Score " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int getHighest(int[] array) {
        int highest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > highest) {
                highest = array[i];
            }
        }
        return highest;
    }
  
    public static int getLowest(int[] array) {
        int lowest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowest) {
                lowest = array[i];
            }
        }
        return lowest;
    }

    public static int getAverage(int[] array) {
        int total = 0;
        int average = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return average = (total / array.length);
    }

    public static int passCounter(int[] array) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 85) {
                counter += 1;
            } 
        }
        return counter;
    }

    public static int failCounter(int[] array) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 85) {
                counter += 1;
            }
        }
        return counter;
    }
}