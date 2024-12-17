package src.main.java;

public class MyTicketMachine {
    // Constants for different ticket prices
    private static final int ADULT_PRICE = 100;  // Adult ticket price in cents
    private static final int SENIOR_PRICE = 80;  // Senior ticket price in cents
    private static final int CHILD_PRICE = 50;   // Child ticket price in cents

    private int price;        // Current ticket price
    private int balance;      // Money inserted by the customer
    private int total;        // Total money collected by the machine

    
