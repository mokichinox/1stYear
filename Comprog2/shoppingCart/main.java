import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        
        String itemList, choice;
        int quantity;
        double price;
        
        Scanner input = new Scanner(System.in);
        ArrayList<Item> cart = new ArrayList<>();
        
        
        while (true) {
            
            itemList = input.next();
            
            quantity = input.nextInt();
            input.nextLine(); 

            price = input.nextDouble();
            input.nextLine(); 
            
            Item item = new Item(itemList, quantity, price);
            cart.add(item);
            
            choice = input.nextLine();
            
            if(!choice.equalsIgnoreCase("y")){
                break;
            }
            
        }
        
        double subtotal = 0;
        
        for (Item item : cart){
            System.out.println(item);
            subtotal += item.getTotalPrice();
        }
        
        System.out.printf("Total amount in shopping cart: %.2f", subtotal);
        
    }
}
