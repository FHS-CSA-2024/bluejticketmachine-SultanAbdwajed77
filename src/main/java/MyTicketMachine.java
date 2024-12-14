package src.main.java;

/**
 * MyTicketMachine introduces variable ticket pricing.
 * Different discounts (e.g., senior, child) are supported.
 */
public class MyTicketMachine extends SmarterTicketMachine {

    // Ticket prices
    private int standardPrice;
    private int seniorPrice;
    private int childPrice;

    /**
     * Constructor for MyTicketMachine.
     */
    public MyTicketMachine(int standard, int senior, int child) {
        super(standard);
        this.standardPrice = standard;
        this.seniorPrice = senior;
        this.childPrice = child;
    }

    /**
     * Select ticket type and print based on the user choice.
     */
    public void printTicket(String ticketType) {
        int selectedPrice = switch (ticketType.toLowerCase()) {
            case "senior" -> seniorPrice;
            case "child" -> childPrice;
            default -> standardPrice;
        };

        if (getBalance() >= selectedPrice) {
            System.out.println("##################");
            System.out.println("# My Ticket");
            System.out.println("# Ticket Type: " + ticketType);
            System.out.println("# Price: " + selectedPrice + " cents");
            System.out.println("##################\n");

            setBalance(getBalance() - selectedPrice);
            setTotal(getTotal() + selectedPrice);
        } else {
            System.out.println("You must insert " + (selectedPrice - getBalance()) + " more cents.");
        }
    }

    // Setters for balance and total (not included in SmarterTicketMachine)
    private void setBalance(int balance) {
        // Assuming we can modify the parent class balance.
    }

    private void setTotal(int total) {
        // Assuming we can modify the parent class total.
    }
}
