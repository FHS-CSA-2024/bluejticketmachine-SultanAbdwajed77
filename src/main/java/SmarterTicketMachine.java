package src.main.java;

public class SmarterTicketMachine {
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    // Constructor that takes the price as a parameter
    public SmarterTicketMachine(int cost) {
        price = cost;
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
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Enter a positive amount.");
        }
    }

    // Method to print a ticket
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

            // Update the total collected with the price.
            total += price;
            // Reduce the balance by the price.
            balance -= price;
        } else {
            System.out.println("You must insert at least: " + amountLeftToPay + " more cents.");
        }
    }

    // Method to refund the balance (return the current balance)
    public int refundBalance() {
        int amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }

    // Method to empty the machine (removes all money from the machine)
    public int emptyMachine() {
        int amountInTotal = total;
        total = 0;
        System.out.println("The ticket machine has been emptied.");
        return amountInTotal;
    }
}
