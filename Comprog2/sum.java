import java.util.Scanner;

public class sum{
    
    public static void main(String[] args){
        
        int number = 0, sum = 0;
        
        Scanner input = new Scanner(System.in);
        
 
        
        while(number >= 0){
            
            System.out.print("");
            number = input.nextInt();
            
            if(number >= 0)
                sum += number;
        }
        
        System.out.printf("Sum = %d", sum);
    }
}
