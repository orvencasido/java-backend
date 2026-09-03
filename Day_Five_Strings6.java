import java.util.Scanner;

public class Day_Five_Strings6 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5};

        System.out.print(linearSearch(sc, array));
    }

    public static int linearSearch(Scanner sc, int[] array) {
        int index = -1;
        int toSearch = 0;

        System.out.print("To Search: ");
        toSearch = sc.nextInt();
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toSearch) {
                index = i;
                break;
            } 
        }
        return index;
    }
}