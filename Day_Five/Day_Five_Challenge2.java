import java.util.Scanner;

public class Day_Five_Challenge2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int[] result = getNum(sc);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }

        System.out.println("Highest: " + getHighest(result));
    }

    public static int[] getNum(Scanner sc) {
        int[] array = new int [5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Number " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }oo
            
        return array;
    }

    public static int getHighest(int[] num) {
        int max = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }

    public static String showGrades(Scanner sc, int[] array) {
        String placeholder = "";
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Number " + (i+1) + ": ");
            array[i] = sc.nextInt(); 
            placeholder += array[i] + " ";
        }
        return placeholder;
    }

}