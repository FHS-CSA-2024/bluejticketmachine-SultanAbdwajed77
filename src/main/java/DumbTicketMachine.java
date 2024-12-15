package src.main.java;

public class DumbTicketMachine {
   private int price;  
   private int balance;  
   private int total;  

   public DumbTicketMachine() {  
      price = 50;  
      balance = 0;  
      total = 0;  
   }  

   public int getPrice() {  
      return price;  
   }  

   public int getBalance() {  
      return balance;  
   }  

   public void insertMoney(int amount) {  
      if (amount > 0) {
          balance += amount;  
      } else {
          System.out.println("Enter a positive amount.");
      }
   }  

   public void printTicket() {  
      if (balance >= price) {  
        System.out.println("##################");  
        System.out.println("# The BlueJ Line");  
        System.out.println("# Ticket");  
        System.out.println("# " + price + " cents.");  
        System.out.println("##################");  
        System.out.println();  
        total += price;  
        balance -= price;  
      } else {
          System.out.println("Not enough money. You need " + (price - balance) + " more cents.");
      }
   }  

   public void empty() {  
      total = 0;  
      System.out.println("The ticket machine has been emptied.");  
   }  
}


package src.main.java;

public class SmarterTicketMachine {
   private int price;  
   private int balance;  
   private int total;  

   public SmarterTicketMachine(int cost) {  
      price = cost;  
      balance = 0;  
      total = 0;  
   }  

   public int getPrice() {  
      return price;  
   }  

   public int getBalance() {  
      return balance;  
   }  

   public void insertMoney(int amount) {  
      if (amount > 0) {  
        balance += amount;  
      } else {  
        System.out.println("Enter a positive amount.");
      }  
   }  

   public void printTicket() {  
      int amountLeftToPay = price - balance;  
      if (balance >= price) {  
        System.out.println("##################");  
        System.out.println("# The BlueJ Line");  
        System.out.println("# Ticket");  
        System.out.println("# " + price + " cents.");  
        System.out.println("##################");  
        System.out.println();  
        total += price;  
        balance -= price;  
      } else {  
        System.out.println("You must insert at least: " + amountLeftToPay + " more cents.");  
      }  
   }  

   public int refundBalance() {  
      int amountToRefund = balance;  
      balance = 0;  
      return amountToRefund;  
   }  

   public int emptyMachine() {  
      int amountInTotal = total;  
      total = 0;  
      System.out.println("The ticket machine has been emptied.");  
      return amountInTotal;  
   }  
}
