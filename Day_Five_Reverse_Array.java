public class Day_Five_Reverse_Array {
    public static void main (String [] args) {
        int[] array = {1,2,3,4,5};

        reverseArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] reverse = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - 1 - i];
            if (i == array.length - 1) {
                System.out.print(reverse[i] + "]");
            } else {
                System.out.print(reverse[i] + ", ");
            }
        }
    }
}