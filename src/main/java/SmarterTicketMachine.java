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

