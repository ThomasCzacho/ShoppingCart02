public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";


        // Declare and initialize numeric fields: price, tax, quantity.
      double price=18.99, tax=1, totalPrice=1;
      int quantity=3;


        // Declare and assign a calculated totalPrice
        totalPrice=price*tax*quantity;

        // Modify message to include quantity
        String message = custName+" wants to purchase "+quantity+ " " +itemDesc;
        System.out.println(message);
        System.out.println("Total Price: $"+totalPrice);
        // Print another message with the total cost

    }
}
