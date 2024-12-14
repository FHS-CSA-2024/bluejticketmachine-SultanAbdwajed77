public class MyTicketMachine extends SmarterTicketMachine {  
   // Define the different ticket types and their prices  
   public enum TicketType {  
      ADULT(100),  
      SENIOR(80),  
      CHILD(50);  
  
      private final int price;  
  
      TicketType(int price) {  
        this.price = price;  
      }  
  
      public int getPrice() {  
        return price;  
      }  
   }  
  
   private TicketType currentTicketType;  
  
   // Constructor that sets the default ticket type to ADULT  
   public MyTicketMachine() {  
      super(0); // Initialize the price to 0, will be updated based on ticket type  
      currentTicketType = TicketType.ADULT;  
      updatePrice();  
   }  
  
   // Method to update the price based on the current ticket type  
   private void updatePrice() {  
      setPrice(currentTicketType.getPrice());  
   }  
  
   // Method to set the ticket type  
   public void setTicketType(TicketType type) {  
      currentTicketType = type;  
      updatePrice();  
   }  
  
   // Override the printTicket method to print the ticket type  
   @Override  
   public void printTicket() {  
      int amountLeftToPay = getPrice() - getBalance();  
      if (getBalance() >= getPrice()) {  
        // Simulate the printing of a ticket.  
        System.out.println("##################");  
        System.out.println("# The BlueJ Line");  
        System.out.println("# " + currentTicketType + " Ticket");  
        System.out.println("# " + getPrice() + " cents.");  
        System.out.println("##################");  
        System.out.println();  
  
        // Update total collected with the price.  
        addTotal(getPrice());  
        // Reduce the balance by the price.  
        reduceBalance(getPrice());  
      } else {  
        System.out.println("You must insert at least: " + amountLeftToPay + " more cents.");  
      }  
   }  
  
   // Add methods to update the total and balance  
   private void addTotal(int amount) {  
      total += amount;  
   }  
  
   private void reduceBalance(int amount) {  
      balance -= amount;  
   }  
  
   // Add a method to get the current ticket type  
   public TicketType getTicketType() {  
      return currentTicketType;  
   }  
  
   // Add a method to set the price  
   private void setPrice(int price) {  
      super.price = price;  
   }  
}
