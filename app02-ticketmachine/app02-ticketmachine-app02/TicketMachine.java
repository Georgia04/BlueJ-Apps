
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
    //The amount of money entered by a customer.
    private int balance;
    
    //The total amount of money collected by the machine.
    private int total;
    
    //The price of the ticket
    private int price;
    
    private Ticket aylesburyTicket;
    
    

    /**
     *Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance=0;
        total = 0;
        
        
        aylesburyTicket = new Ticket("Aylesbury",220);
        
     
    }
    
    /**
     * Add coins using Coin.P
     */
    
    public void addCoin(Coin coin)
    {
        System.out.println("You have inserted: " + coin);
        balance = balance + coin.getValue();
        System.out.println("Your balance is: " + balance + "p");
    }
    
 

    /**
     *Return the amount of money inserted for the next ticket
     */
    
    public int getBalanace()
    {
        return balance;
    }
    
    public void insertMoney(int amount)
    {
         if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }
    
    public void insert20p()
    {
        balance = balance + 20;
        printBalance(20);
    }
    
    public void insert10p()
    {
        balance = balance + 10;
        printBalance(10);
    }
    public void insert100p()
    {
        balance = balance + 100;
        printBalance(100);
    }
    
    public void insert200p()
    {
        balance = balance + 200;
        printBalance(200);
    }
    
    public void printBalance(int amount)
    {
        System.out.println("You have inserted" + amount);
        System.out.println("Current balance = " + balance);
    }
    
    /**
     * * Choose a destination, and if balance is greater than price
      * then buy the ticket, otherwise insert amount required.
     */
    
    public void printTicket()
    {
        int price = 220;
         if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        
        }
        else
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
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
