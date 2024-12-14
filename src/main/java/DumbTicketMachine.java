public class DumbTicketMachine {  
   // The price of a ticket from this machine.  
   private int price;  
   // The amount of money entered by a customer so far.  
   private int balance;  
   // The total amount of money collected by this machine.  
   private int total;  
  
   // Constructor that takes the price as a parameter  
   public DumbTicketMachine(int cost) {  
      price = cost;  
      balance = 0;  
      total = 0;  
   }  
  
   // Constructor that sets the default price  
   public DumbTicketMachine() {  
      price = 50; // Default price  
      balance = 0;  
      total = 0;  
   }  
  
   // Method to return the price of a ticket  
   public int getPrice() {  
      return price;  
   }  
  
   // Method to return the amount of money already inserted for the next ticket  
   public int getBalance() {  
      return balance;  
   }  
  
   // Method to receive an amount of money from a customer  
   public void insertMoney(int amount) {  
      balance += amount;  
   }  
  
   // Method to print a ticket  
   public void printTicket() {  
      // Simulate the printing of a ticket.  
      System.out.println("##################");  
      System.out.println("# The BlueJ Line");  
      System.out.println("# Ticket");  
      System.out.println("# " + price + " cents.");  
      System.out.println("##################");  
      System.out.println();  
  
      // Update the total collected with the balance.  
      total += balance;  
      // Clear the balance.  
      balance = 0;  
   }  
  
   // Method to empty the machine  
   public int empty() {  
      int amountInTotal = total;  
      total = 0;  
      System.out.println("The ticket machine has been emptied.");  
      return amountInTotal;  
   }  
}
