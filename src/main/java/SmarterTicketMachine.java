package src.main.java;

/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @version 2024.09.06
 */
public class SmarterTicketMachine {
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public SmarterTicketMachine(int cost) {
        price = cost;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Return the amount of money already inserted for the next ticket.
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount; 
        } else {
            System.out.println("Use a positive amount rather than: " + amount); // Print error for negative input
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket() {
        int amountLeftToPay = price - balance;

        if (balance >= price) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update total collected with the price.
            total += price;

            // Reduce the balance by the price.
            balance -= price;
        } else {
            System.out.println("You must insert at least: " + amountLeftToPay + " more cents."); // Print error for insufficient balance
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance() {
        int amountToRefund = balance;
        balance = 0; // Clear balance
        return amountToRefund; // Return refunded amount
    }

    /**
     * Empty ticket machine of all collected money.
     * Resets total to 0 and return value that was in total.
     */
    public int emptyMachine() {
        int amountInTotal = total; // Store total amount
        total = 0; // Reset total to 0
        System.out.println("The ticket machine has been emptied.");
        return amountInTotal; // Return previously collected total
    }
}
