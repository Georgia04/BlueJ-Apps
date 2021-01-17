import java.util.Date;

/**
 * This class shows the attributes of the ticket. The destination, the price
 * of the ticket and the date-time.
 * @author (Georgia)
 * @version (a version number or a date)
 */
public class Ticket
{
    //Attributes
    private String destination;
    private int price;
    private Date dateTime;
    
    public Ticket(String destination, int price)
    {
        this.destination = destination;
        this.price = price;
         dateTime = new Date();
    }
    
    /**
     * Return the ticket's destination as s string
     */
    public String getDestination()
    {
        return destination;
    }
    
    /**
     * Return the ticket's price as an integer.
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Print all the details about the ticket into the system
     */
     public void print()
    {
        System.out.println("--------------------------");
        System.out.println("   Ticket: " + destination);
        System.out.println("   Price: " + price + "p ");
        System.out.println("--------------------------");
        System.out.println("   Date: " + dateTime);
        System.out.println("--------------------------");
    }
    
    
}
