package src.main.java;

public class MyTicketMachine extends SmarterTicketMachine {
   private static final int ADULT_PRICE = 100;  
   private static final int SENIOR_PRICE = 80;  
   private static final int CHILD_PRICE = 50;  

   public MyTicketMachine() {
      super(ADULT_PRICE);  
   }

   public void setAdultTicketPrice() {
      super.insertMoney(ADULT_PRICE);
   }

   public void setSeniorTicketPrice() {
      super.insertMoney(SENIOR_PRICE);
   }

   public void setChildTicketPrice() {
      super.insertMoney(CHILD_PRICE);
   }

   public int getTicketPrice() {
      return super.getPrice();
   }

   public void printTicket() {
      super.printTicket();
   }

   public int refundBalance() {
      return super.refundBalance();
   }

   public int emptyMachine() {
      return super.emptyMachine();
   }
}
