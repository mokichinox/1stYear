import java.util.Scanner;
import java.lang.Math;

public class shape{
	public static void main(String[] args){
	    
	    char shape;
        double side = 0;
        double width = 0;
        double length = 0;
        double height = 0;
        
        Scanner input = new Scanner(System.in);
        
        while (true){
            System.out.println("Choose a Shape");
            System.out.println("A: Square");
            System.out.println("B: Rectangle");
            
            System.out.print("Shape: ");
            shape = input.next().toUpperCase().charAt(0);
            
            if (shape == 'A' || shape == 'B') {
                break;
            }
            else {
                System.out.println("Shape not found! Try Again");
            }
        }
        
        switch (shape) {
            
            case 'A':
                System.out.print("Input side: ");
                side = input.nextDouble();
                square(side);
                break;
                
            case 'B':
                System.out.print("Input Width: ");
                width = input.nextDouble();
                System.out.print("Input Length: ");
                length = input.nextDouble();
                System.out.print("Input Height: ");
                height = input.nextDouble();
                rectangle(length, width, height);
                break;
                
            default:
            
                break;
            
        }
        
    }
    
    public static void square(double side){
        
        //area = s^2 ; volume = s^3
        
        double area = Math.pow(side, 2);
        double volume = Math.pow(side, 3);
        
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Volume: %.2f\n", volume);
        
    }
        
    public static void rectangle(double length, double width, double height) {
        
        //area = l * w ; volume = l * w * h
        
        double area = length * width;
        double volume = length * width * height;
        
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Volume: %.2f\n", volume);
        
    }
}
