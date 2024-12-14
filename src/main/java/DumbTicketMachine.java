package src.main.java;

/**
 * DumbTicketMachine models a naive ticket machine.
 * This class assumes users will always input the correct values.
 *
 * @author Modified
 * @version 2024.12.14
 */
public class DumbTicketMachine {

    private int price;    // Ticket price
    private int balance;  // Money inserted by the user
    private int total;    // Total money collected by the machine

    /**
     * Constructor that sets the price to a default value (e.g., 50 cents).
     */
    public DumbTicketMachine() {
        this.price = 50; // Default price
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
     * Return the balance entered so far.
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Insert money into the machine.
     */
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("You cannot insert negative or zero money.");
        }
    }

    /**
     * Empty the machine of all collected money.
     * This resets the total to zero.
     */
    public void empty() {
        total = 0; // Clear the total
        System.out.println("Machine emptied. All collected money removed.");
    }

    /**
     * Print a ticket.
     * Updates total only if sufficient money is provided.
     */
    public void printTicket() {
        if (balance >= price) {
            System.out.println("##################");
            System.out.println("# Dumb Ticket");
            System.out.println("# Ticket Price: " + price + " cents.");
            System.out.println("##################\n");

            total += price;
            balance -= price;
        } else {
            System.out.println("You need at least " + (price - balance) + " more cents.");
        }
    }

    /**
     * Return the balance as a refund and reset balance to zero.
     */
    public int refundBalance() {
        int refund = balance;
        balance = 0;
        System.out.println("Refunding " + refund + " cents.");
        return refund;
    }
}
