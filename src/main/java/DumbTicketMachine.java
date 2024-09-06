package src.main.java;

/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class DumbTicketMachine{
    private int price;
    private int balance;
    private int total;

    public DumbTicketMachine(int cost){
        price = cost;
        balance = 0;
        total = 0;
    }
    
    public DumbTicketMachine(){
        price = 50; // Default price
        balance = 0;
        total = 0;
    }

    public int getPrice(){
        return price;
    }

    public int getBalance(){
        return balance;
    }

    public void insertMoney(int amount){
        balance += amount;
    }

    public void printTicket(){
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();
        
        total += balance;
        balance = 0;
    }

    public void empty(){
        total = 0;
        balance = 0;
        System.out.println("The ticket machine has been emptied.");
    }
}
