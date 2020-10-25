import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
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
    
    public int getPrice()
    {
        return price;
    }
    
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
