import java.util.Scanner;

public class finalQPI{
    
    public static void main(String[] args){
    
        String subject;
        int numSub;
        int i = 1;
        double grade = 0;
        double units = 0;
        double totalGrade = 0;
        double totalUnits = 0;
        double qpe = 0;
        double totalQPI = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("");
        numSub = input.nextInt();
        input.nextLine();
        
        while (i <= numSub){
            
            System.out.print(""); 
            subject = input.nextLine();
        
            System.out.print("");
            grade = input.nextDouble();
            input.nextLine();
            
             
            if (grade < 0 || grade > 100){
                System.out.println("Error! Wrong Grade");
                return;
            } else {
            
                System.out.print("");
                units = input.nextDouble();
                input.nextLine();
               
                
                if (grade <= 100 && grade >= 92) {
                    System.out.println("Letter Grade = A");
                    qpe = 4.0;
                }
                        
                else if (grade <=91  && grade >= 88) {
                    System.out.println("Letter Grade = B+");
                    qpe = 3.5;
                }
                            
                else if (grade <=87  && grade >=84 ) {
                    System.out.println("Letter Grade = B");
                    qpe = 3.0;
                }
                    
                else if (grade <=83  && grade >= 80) {
                    System.out.println("Letter Grade = C+");
                    qpe = 2.5;
                }
                   
                else if (grade <=79  && grade >= 76) {
                    System.out.println("Letter Grade = C");
                    qpe = 2.0;
                }
                   
                else if (grade <=75  && grade >= 72) {
                    System.out.println("Letter Grade = D");
                    qpe = 1.0;
                }
                   
                else if (grade <=91  && grade >= 88) {
                    System.out.println("Letter Grade = F");
                    qpe = 0.0;
                }
            
                totalGrade += qpe * units;
                totalUnits += units;
                
                i++;
                
            }
        
        }
       
        
        totalQPI = totalGrade / totalUnits;
        
        System.out.printf("QPI: %.2f%n", totalQPI);
        
        if (totalQPI >= 3.7)
            System.out.print("Congrats! You are a President's Lister");
        
        else if (totalQPI >= 3.4)
            System.out.print("Congrats! You are a Dean's Lister");
        
        
                
        }
    }
