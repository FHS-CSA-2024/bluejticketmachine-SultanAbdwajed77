package src.test.java;
import src.main.java.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTicketMachine
{
    private DumbTicketMachine dumbMachine;
    private SmarterTicketMachine smarterMachine;
    private MyTicketMachine myMachine;

    @BeforeEach
    public void setUp() {
        dumbMachine = new DumbTicketMachine(50); 
        smarterMachine = new SmarterTicketMachine(50); 
        myMachine = new MyTicketMachine();
    }

    @Test
    public void dumbTicketMachineTest() {
        assertEquals(50, dumbMachine.getPrice());
        assertEquals(0, dumbMachine.getBalance());
        dumbMachine.insertMoney(50);
        assertEquals(50, dumbMachine.getBalance());
        dumbMachine.printTicket();
        assertEquals(0, dumbMachine.getBalance());
    }

    @Test
    public void smarterTicketMachineTest() {
        assertEquals(50, smarterMachine.getPrice());
        smarterMachine.insertMoney(30);
        smarterMachine.printTicket(); // Expect a message about insufficient funds
        smarterMachine.insertMoney(20);
        smarterMachine.printTicket(); // Should now be able to print the ticket
        assertEquals(0, smarterMachine.getBalance());
    }

    @Test
    public void myTicketMachineTest() {
        assertEquals(100, myMachine.getTicketPrice()); // Default price is Adult
        myMachine.setSeniorTicketPrice();
        assertEquals(80, myMachine.getTicketPrice()); // Now it's Senior price
        myMachine.insertMoney(80);
        myMachine.printTicket(); // Should print the ticket
    }
}
