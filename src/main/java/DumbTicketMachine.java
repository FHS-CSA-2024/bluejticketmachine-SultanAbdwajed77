package src.main.java;

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

    
