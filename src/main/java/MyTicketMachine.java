package src.main.java;

public class MyTicketMachine {
   // Constants for different ticket prices
   private static final int ADULT_PRICE = 100;  // Adult ticket price in cents
   private static final int SENIOR_PRICE = 80;  // Senior ticket price in cents
   private static final int CHILD_PRICE = 50;   // Child ticket price in cents

   private int price;        // Current ticket price
   private int balance;      // Money inserted by the customer
   private int total;        // Total money collected by the machine

   // Constructor with default price set to Adult
   public MyTicketMachine() {
      price = ADULT_PRICE;  // Default price is for Adult
      balance = 0;
      total = 0;
   }

   // Method to set the ticket price for Adult
   public void setAdultTicketPrice() {
      price = ADULT_PRICE;
   }

   // Method to set the ticket price for Senior
   public void setSeniorTicketPrice() {
      price = SENIOR_PRICE;
   }

   // Method to set the ticket price for Child
   public void setChildTicketPrice() {
      price = CHILD_PRICE;
   }

   // Method to return the current ticket price
   public int getTicketPrice() {
      return price;
   }

   // Method to insert money into the machine
   public void insertMoney(int amount) {
      if (amount > 0) {
         balance += amount;
      } else {
         System.out.println("Please insert a positive amount.");
      }
   }

   // Method to print a ticket
   public void printTicket() {
      if (balance >= price) {
         // Print the ticket
         System.out.println("##################");
         System.out.println("# Ticket Machine");
         System.out.println("# " + price + " cents - Ticket");
         System.out.println("##################");
         System.out.println();

         // Update the total collected and deduct the ticket price from the balance
         total += price;
         balance -= price;
      } else {
         int amountLeftToPay = price - balance;
         System.out.println("Insufficient funds. You need " + amountLeftToPay + " more cents.");
      }
   }

   // Method to refund the balance (return the current balance)
   public int refundBalance() {
      int refundAmount = balance;
      balance = 0;
      return refundAmount;
   }

   // Method to empty the machine (return the total money collected and reset the total)
   public int emptyMachine() {
      int emptiedAmount = total;
      total = 0;
      System.out.println("The ticket machine has been emptied.");
      return emptiedAmount;
   }

   // Method to get the current balance (money inserted by the customer)
   public int getBalance() {
      return balance;
   }

   // Method to get the total money collected by the machine
   public int getTotal() {
      return total;
   }
}
