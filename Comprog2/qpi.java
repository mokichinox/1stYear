import java.util.Scanner;

public class qpi {


    public static void main(String[] args) {
        int i = 1;
        int totalUnits = 0;
        float totalGrade = 0;
        

        System.out.println("Welcome to QPI Calculator!\n");

        while (i <= 3) {
            Scanner sc = new Scanner(System.in);
            
  
            System.out.printf("Enter your grade: ");
            float grade = sc.nextFloat();
            
            System.out.printf("Enter your units: ");
            int units = sc.nextInt();
            sc.nextLine();
            System.out.print('\n');
            

            totalGrade += grade * units;
            totalUnits += units;
            i++;
        } 

        float qpi = totalGrade / totalUnits;
        
        System.out.printf("Your QPI is: %.2f%n", qpi);
        
        if (qpi >= 3.4 && qpi <= 3.6)
            System.out.print("You are a Dean's Lister!");
        
        else if (qpi >= 3.7 && qpi <= 4)
            System.out.print("You are a President's Lister!");
        

        
    
    }
    
}
