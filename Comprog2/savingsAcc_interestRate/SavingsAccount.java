class SavingsAccount{
    
    static double annualInterestRate;
    private String accountNumber, customerName, phoneNumber;
    private double savingsBalance;
    
    public SavingsAccount(String accountNumber, String customerName, String phoneNumber, double startingBalance){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.savingsBalance = startingBalance;
    }
    
    public void deposit(double amount) {
        savingsBalance += amount;
        System.out.printf("Deposited %.2f new balance is %.2f\n", amount, savingsBalance);
    }
    
    public void withdraw(double amount) {
        if (amount > savingsBalance){
            System.out.printf("Insufficient funds, available balance is %.2f\n", savingsBalance);
        }
    
        else {
            savingsBalance -= amount;
            System.out.printf("Withdrawed %.2f new balance is %.2f\n", amount, savingsBalance);
        }
    }
    
    public void calculateMonthlyInterest(double annualInterestRate) {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        
        savingsBalance += monthlyInterest;
        System.out.printf("New balance after interest rate is applied %.2f\n", savingsBalance);
    }
    
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }
}
