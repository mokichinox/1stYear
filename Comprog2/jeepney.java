import java.util.Scanner;

public class jeepney {
    
    public static void main(String[] args){
        
        char fareType;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Welcome to Jeepney Calculator!\n\n");
        
// re-prompt user if they entered invalid char in fareType

        while (true) {
            
            System.out.print("\nFare Type: ");
            fareType = input.next().toUpperCase().charAt(0);
            
            if (fareType == 'R' || fareType == 'D') {
                break;
            }
            else {
                System.out.println("\nInvalid fare type. Please enter again.");
            }
        }
        
        
        System.out.print("Distance: ");
        int distance = input.nextInt();
        
        
        switch (fareType) {
            
            case 'R':
                double reg = 13.00;
                
                if (distance <= 5) {
                    System.out.printf("\nFare is Php %.2f", reg);
                }
                else {
                    double regRate = (distance - 5) * 1.25 + reg; 
                    System.out.printf("\nFare is Php %.2f", regRate);
                }
                
                break;
            
            case 'D':
                double disc = 10.40;
                
                if (distance <= 5) {
                    System.out.printf("\nFare is Php %.2f", disc);
                }
                else {
                    double discRate = (distance - 5) * 1 + disc;
                    System.out.printf("\nFare is Php %.2f", discRate);
                }
                
                break;
                
            default:
                break;
            
        }
    }
}
