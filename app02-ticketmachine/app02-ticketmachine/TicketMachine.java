
/**
 * * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author (Georgia)
 * @version (a version number or a date)
 */
public class TicketMachine
{
    // The method for using coins for payment.
    private Coin coin;
    
    //The amount of money entered by a customer.
    private int balance;
    
    //The total amount of money collected by the machine.
    private int total;
    
    ////Creates a new ticket, inserting the destination and the price.
    public Ticket aylesburyTicket = new Ticket("Aylesbury", 2.20);
    public Ticket amershamTicket = new Ticket("Amersham", 3.00);
    public Ticket highWycombeTicket = new Ticket("High Wycombe", 3.30);

    /**
     *Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance=0;
    }

    /**
     *Please add coins using Coin.P (eg: Coin.P200 for 200p) 
     */
    
    public void addcoin(Coin coin)
    {
        System.out.println("You have inserted: " + coin);
        balance = balance + coin.getValue();
        System.out.println("Your balance is: " + balance + "p");
    }
    
    public void printAllTickets()
    {
        System.out.println("The avaliable tickets are: ");
        System.out.println("                           ");
        System.out.println("The Amersham ticket: ");
        amershamTicket.PrintTicketInfo();
        System.out.println("The Aylesbury ticket: ");
        aylesburyTicket.PrintTicketInfo();
        System.out.println("The High Wycombe ticket: ");
        highWycombeTicket.PrintTicketInfo();
    }
    
    /**
     * * Choose a destination, and if balance is greater than price
      * then buy the ticket, otherwise insert amount required.
     */
    
    public void buyticket(String destination) 
    {
        if (destination.equals("Aylesbury"))
        {
            if (balance < 220)
            {
                System.out.println("Insert: " + (220 - balance) + "p");
            }
            else
            {
                System.out.println("Payment succesful.");
            System.out.println("Please take your ticket:");
            aylesburyTicket.PrintTicket();
            balance = balance - 220;
            System.out.println("   Your refund is: " + balance + "p");
            }
        }
        
        else if(destination.equals("Amersham"))
        {
            if (balance < 300)
            {
                System.out.println("Insert: " + (300 - balance) + "p");
            }
            else
            {
            System.out.println("Payment succesful.");
            System.out.println("Please take your ticket:");
            amershamTicket.PrintTicket();
            balance = balance - 300;
            System.out.println("   Your refund is: " + balance + "p");
            }
        }
        else if(destination.equals("High Wycombe"))
        {
            if (balance < 330)
            {
                System.out.println("Insert: " + (330 - balance) + "p");
            }
            else
            {
                System.out.println("Payment recieved.");
            System.out.println("Please take your ticket:");
            highWycombeTicket.PrintTicket();
            balance = balance - 330;
            System.out.println("   Your refund is: " + balance + "p");
            }
            
        }
    }
          
        
        /**
         * Return the money in the balance.
         * The balance is cleared.
         */
        
         public void refundBalance()
    {
        System.out.println("Your refund is: " + balance + "p");
        balance = 0;
    }
    
}
