import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 *
 * @author (David J. Barnes and Michael Kölling.)
 * @version (2016.02.29)
 * @modified Georgia Gkegka
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    
    Random generator = new Random();

    /**
     * Create a StockManager and populate it with a few sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(250,"iPhone"));
        manager.addProduct(new Product(251,"Wireless headphones"));
        manager.addProduct(new Product(252,"Microwave Oven"));
        manager.addProduct(new Product(253, "Google Pixel A4"));
        manager.addProduct(new Product(254, "Samsung Galaxy S10"));
        manager.addProduct(new Product(255, "Apple iPhone 12"));
        manager.addProduct(new Product(256, "PlayStation 4"));
        manager.addProduct(new Product(257, "iPhone 12 Pro"));
        manager.addProduct(new Product(258, "Smart TV"));
        manager.addProduct(new Product(259, "Radio"));
        manager.addProduct(new Product(260, "Laptop"));
        
    }

    /**
     * Delievers random amounts of items to the list.
     */
    public void demoDeliver()
    {
        System.out.println("Delivering:");
        
        int amount = 0;
        
        for(int id = 250; id <= 260; id++)
        {
            amount = generator.nextInt(7) + 1;
            manager.delivery(id, amount);
        }
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDeliverProduct()
    {
        // Show details of all of the products before delivery.
        manager.printProduct(251);
        
        // Take delivery of 5 items of one of the products.
        manager.delivery(251, 5);
        
        // Show the list of all products after delivery
        manager.printProduct(251);
    }
}
