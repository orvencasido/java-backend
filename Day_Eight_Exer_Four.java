import java.util.Scanner;

public class Day_Eight_Exer_Four {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int length, width = 0;

        System.out.print("Enter Length: ");
        length = sc.nextInt();

        System.out.print("Enter Width: ");
        width = sc.nextInt();

        Rectangle rec1 = new Rectangle(length, width);

        rec1.displayInfo();
        System.out.println("Area: " + rec1.getArea());
        System.out.println("Perimeter: " + rec1.getPerimeter());
    }
}

public class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void displayInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }
}