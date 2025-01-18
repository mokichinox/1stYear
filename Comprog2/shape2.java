import java.util.Scanner;
import java.lang.Math;

public class shape2 {
    static Scanner input = new Scanner(System.in);
    static char shape;

    public static void main(String[] args) {
        main2();
    }

    public static void main2() {
        while (true) {
            System.out.println("Choose a Shape");
            System.out.println("A: Square");
            System.out.println("B: Rectangle");
            System.out.println("C: Triangle");
            System.out.println("D: Circle");

            System.out.print("Shape: ");
            shape = input.next().toUpperCase().charAt(0);

            if (shape == 'A' || shape == 'B' || shape == 'C' || shape == 'D') {
                break;
            } else {
                System.out.println("Shape not found! Try Again");
            }
        }

        switch (shape) {
            case 'A':
                System.out.print("Input side: ");
                double side = input.nextDouble();
                square(side);
                break;

            case 'B':
                System.out.print("Input Length: ");
                double length = input.nextDouble();
                System.out.print("Input Width: ");
                double width = input.nextDouble();
                System.out.print("Input Height: ");
                double height = input.nextDouble();
                rectangle(length, width, height);
                break;

            case 'C':
                System.out.print("Input Length: ");
                double tLength = input.nextDouble();
                System.out.print("Input Base: ");
                double base = input.nextDouble();
                System.out.print("Input Height: ");
                double tHeight = input.nextDouble();
                triangle(base, tHeight, tLength);
                break;

            case 'D':
                System.out.print("Input Diameter: ");
                double diameter = input.nextDouble();
                circle(diameter);
                break;

            default:
                break;
        }
        choice();
    }

    public static void square(double side) {
        double area = Math.pow(side, 2);
        double volume = Math.pow(side, 3);

        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Volume: %.2f\n", volume);
    }

    public static void rectangle(double length, double width, double height) {
        double area = length * width;
        double volume = length * width * height;

        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Volume: %.2f\n", volume);
    }

    public static void triangle(double base, double tHeight, double tLength) {
        double area = 0.5 * (base * tHeight);
        double volume = 0.5 * (base * tHeight * tLength);

        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Volume: %.2f\n", volume);
    }

    public static void circle(double diameter) {
        double radius = diameter / 2;
        double area = Math.PI * Math.pow(radius, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Volume: %.2f\n", volume);
    }

    public static void choice() {
        System.out.println("Continue?");
        System.out.print("Choice: ");
        String userChoice = input.next().toUpperCase();

        if (!userChoice.equals("YES")) {
            System.exit(0);
        } else {
            main2();
        }
    }
}
