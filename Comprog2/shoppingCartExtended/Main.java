import java.util.ArrayList;
import java.util.Scanner;
public class Main {
   private static ArrayList<Item> shoppingCart = new ArrayList<>();
   private static Scanner input = new Scanner(System.in);
   
   public static void main(String[] args) throws Exception {
     
      
      String menuItems = "y";
      boolean selection = true;
      while(selection) {
         System.out.println("-----------------------------------------------");
         System.out.println("A: Add items to cart");
         System.out.println("V: View cart");
         System.out.println("E: Edit item");
         System.out.println("D: Delete item");
         System.out.println("C: Compute Total and Clear the cart");
         System.out.println("Q: Quit");
         System.out.print("Enter choice: ");
         menuItems = input.nextLine();
         System.out.println("-----------------------------------------------");
         switch(menuItems.toUpperCase()) {
            case "A" :  addItemtoCart(shoppingCart);
                     break;
            case "V" :  viewCart(shoppingCart);
                     break;
            case "E" :  editItem(shoppingCart);
                     break;
            case "D" :  deleteItem(shoppingCart);
                     break;
            
            case "C" :  checkOut(shoppingCart);
                     break; 
            case "Q" :  selection = false;
                     break;
         }
      }
   }
   public static void addItemtoCart(ArrayList<Item> sCart) {
       String itemList = input.next();
       
       int quantity = input.nextInt();
       input.nextLine();
       
       double price = input.nextDouble();
       input.nextLine();
       
       Item item = new Item(itemList, quantity, price);
       shoppingCart.add(item);
   }
   public static void viewCart(ArrayList<Item> sCart) {
        double subtotal = 0;
        int itemNum = 1;
       for (Item item : shoppingCart){
            System.out.println("[" + itemNum + "]" + item);
            subtotal += item.getTotalPrice();
            itemNum++;
        }
   }
   public static void editItem(ArrayList<Item> sCart) {
    
      System.out.print("Which item do you want to edit? ");
   
       int itemNum = input.nextInt();
       input.nextLine();
       
       if (itemNum < 1 || itemNum > shoppingCart.size()) {
            System.out.println("Invalid item number.");
            return;
        }
       
       String itemList = input.next();
       input.nextLine();
       
       int quantity = input.nextInt();
       input.nextLine();
       
       double price = input.nextDouble();
       input.nextLine();
      
       
       shoppingCart.set(itemNum - 1, new Item(itemList, quantity, price));
       System.out.println("");
       viewCart(shoppingCart);
   }
  
   public static void deleteItem(ArrayList<Item> sCart) {
       
       System.out.print("Which item do you want to delete? ");
       int itemNum = input.nextInt();
       input.nextLine();
       
        if (itemNum < 1 || itemNum > shoppingCart.size()) {
            System.out.println("Invalid item number.");
            return;
        } 
       
       shoppingCart.remove(itemNum - 1);
       System.out.println("");
       viewCart(shoppingCart);
   }
   

   public static void checkOut(ArrayList<Item> sCart) {
       
    double subtotal = 0;

    for (Item item : shoppingCart)
        subtotal += item.getTotalPrice();
    
    System.out.printf("Total amount in shopping cart: %.2f\n", subtotal);
    
    clearCart(shoppingCart);
   }


   public static void clearCart(ArrayList<Item> sCart) {
       shoppingCart.clear();
   }
  
}

