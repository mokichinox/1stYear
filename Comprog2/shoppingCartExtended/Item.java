class Item {
    private String itemList;
    private double price;
    private int quantity;
    
    public Item(String itemList, int quantity, double price) {
        this.itemList = itemList;
        this.quantity = quantity;
        this.price = price;
    }
    
    public String getItemList() {
        return itemList;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public double getPrice() {
        return price;
    }
    
    public double getTotalPrice() {
        return quantity * price;
    }
    
    public String toString() {
        return itemList + "\t\t" + quantity + "\t" +  String.format("%.2f", price) + "\t\t" + String.format("%.2f", getTotalPrice());
    }
}
