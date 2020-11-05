/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * @modified Georgia
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    
    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(132, "iPhone"));
        manager.addProduct(new Product(37,  "Wireless headphones"));
        manager.addProduct(new Product(23,  "Microwave Oven"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDeliverProduct()
    {
        // Show details of all of the products.
        manager.printProduct(37);
        // Take delivery of 5 items of one of the products.
        manager.delivery(132, 5);
        //show the list of all products after delivery
        manager.printProduct(37);
    }
    
    
    
    
}
