public class Day_Four_Part_Two_Exercise_One2 {
    public static void main (String [] args) {
        int[] num = {1,2,3,4,5};
        int max, min, total, average, evenCount, oddCount = 0;

        max = findMaximum(num);
        System.out.println("Maximum: " + max);

        min = findMinimum(num);
        System.out.println("Minimum: " + min);

        total = calculateSum(num);
        System.out.println("Total: " + total);

        average = calculateAverage(num);
        System.out.println("Average: " + average);

        evenCount = countEvenNumbers(num);
        System.out.println("Even Count: " + evenCount);

        oddCount = countOddNumbers(num);
        System.out.println("Odd Count: " + oddCount);

        num = reverseArray(num);
        System.out.println("Reverse: " + num);
    }

    public static int findMaximum(int[] num) {
        int max = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        } 
        return max;
    }

    public static int findMinimum(int[] num) {
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            } 
        }
        return min;
    }

    public static int calculateSum(int[] num) {
        int total = 0;
        
        for (int i = 0; i < num.length; i++) {
            total += num[i];
        }
        return total;
    }

    public static int calculateAverage(int[] num) {
        int total = 0;
        int average = 0;

        for (int i = 0; i < num.length; i++) {
            total += num[i];
        }
        average = (total / num.length);

        return average;
    }

    public static int countEvenNumbers(int[] num) {
        int count = 0;
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countOddNumbers(int[] num) {
        int count = 0;
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                continue;
            } else {
                count++;
            }
        }
        return count;
    }

    public static int reverseArray(int[] num) {
        int[] reversed = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            reversed[i] = num[num.length]
        }
    }
}