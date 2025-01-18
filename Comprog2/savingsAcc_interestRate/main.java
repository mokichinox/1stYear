import java.util.Scanner;

public class main {
    public static void main(String[] args){
        
        String accountNumber, customerName, phoneNumber;
        double startingBalance, depositAmount, annualInterestRate, withdrawAmount;
        
        Scanner in = new Scanner(System.in);
        
        accountNumber = in.nextLine();
        customerName = in.nextLine();
        phoneNumber = in.nextLine();
        startingBalance = in.nextDouble();
        depositAmount = in.nextDouble();
        annualInterestRate = in.nextDouble();
        withdrawAmount = in.nextDouble();
        
        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, customerName, phoneNumber, startingBalance);
        
        savingsAccount.deposit(depositAmount);
        savingsAccount.withdraw(withdrawAmount);
        savingsAccount.calculateMonthlyInterest(annualInterestRate);
    }
}
