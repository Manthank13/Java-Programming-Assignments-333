import java.util.Scanner;

public class RectangleAreaCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double length;
        double width;
        double area;

        System.out.print("Enter length of rectangle: ");
        length = input.nextDouble();

        System.out.print("Enter width of rectangle: ");
        width = input.nextDouble();

        area = length * width;

        System.out.println("Area of Rectangle = " + area);

        input.close();
    }
}