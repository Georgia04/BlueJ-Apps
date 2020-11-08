


import java.util.Random;
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
    
    private Random randomGenerator;
    
    /**
     * Create a StockManager and populate it with a few
     * products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        randomGenerator = new Random();
        
        manager.addProduct(new Product(132,"iPhone"));
        manager.addProduct(new Product(130,"Wireless headphones"));
        manager.addProduct(new Product(128,"Microwave Oven"));
        manager.addProduct(new Product(118, "Google Pixel A4"));
        manager.addProduct(new Product(150, "Samsung Galaxy S10"));
        manager.addProduct(new Product(120, "Apple iPhone 12"));
        manager.addProduct(new Product(110, "PlayStation 4"));
        manager.addProduct(new Product(100, "iPhone 12 Pro"));
        manager.addProduct(new Product(55, "Smart TV"));
        manager.addProduct(new Product(50, "Radio"));
    }
    
    /**
     * This method will run all the tests needed to 
     * demonstrate that the requirements have been met
     */
    public void runDemo()
    {
        manager.printAllProducts();
        demoDeliverProducts();
        manager.printAllProducts();
        demoSellProducts();
        manager.printAllProducts();
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDeliverProducts()
    {
       int quantity = 0;
       
       for(int id = 132; id <= 50; id++)
       {
          quantity = randomGenerator.nextInt(7);
           manager.deliverProduct(id,quantity ); 
       }
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
     private void demoSellProducts()
    {
        int quantity = 0;
        
        for(int id = 101; id <= 110; id++)
        {
            quantity = randomGenerator.nextInt(5);
            manager.sellProduct(id, quantity);
        }
    }
    
}
