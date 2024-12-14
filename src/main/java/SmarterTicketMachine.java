package src.main.java;

/**
 * SmarterTicketMachine extends the DumbTicketMachine.
 * This machine includes advanced features such as validating money input.
 */
public class SmarterTicketMachine {

    private int price;
    private int balance;
    private int total;

    /**
     * Constructor with a custom ticket price.
     */
    public SmarterTicketMachine(int cost) {
        this.price = cost > 0 ? cost : 50; // Default to 50 cents if invalid cost
        this.balance = 0;
        this.total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Return the current balance.
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Insert money into the machine.
     * Ensures only valid amounts are accepted.
     */
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Error: Cannot insert negative or zero money.");
        }
    }

    /**
     * Print a ticket if enough balance is available.
     * Updates total only for successful transactions.
     */
    public void printTicket() {
        int amountLeftToPay = price - balance;
        if (amountLeftToPay <= 0) {
            System.out.println("##################");
            System.out.println("# Smart Ticket");
            System.out.println("# Price: " + price + " cents");
            System.out.println("##################\n");

            total += price;
            balance -= price;
        } else {
            System.out.println("You must insert " + amountLeftToPay + " more cents.");
        }
    }

    /**
     * Empty the machine of collected money.
     * Resets total and returns the amount emptied.
     */
    public int emptyMachine() {
        int emptiedAmount = total;
        total = 0;
        System.out.println("Machine emptied. Total removed: " + emptiedAmount + " cents.");
        return emptiedAmount;
    }

    /**
     * Refund the balance and reset it to zero.
     */
    public int refundBalance() {
        int refund = balance;
        balance = 0;
        System.out.println("Refunding " + refund + " cents.");
        return refund;
    }
}
