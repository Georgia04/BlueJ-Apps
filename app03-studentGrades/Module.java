
/**
 * This class shows the title of the module, the code number and the 
 * percentage mark
 *
 * @author (Georgia)
 * @version (a version number or a date)
 */
public class Module
{
    private String moduleTitle;
    
    private String moduleCode;
    
    public int mark;
    
    

    
    public Module(String moduleTitle,String moduleCode)
    {
       mark = 0;
       this.moduleTitle = moduleTitle;
       this.moduleCode = moduleCode;
       
    }
    
    public void awardMark(int mark)
    {
        if((mark >= 0) && (mark <= 100))
        {
            this.mark = mark;
            
        }
        else
        {
            System.out.print("Invalid mark!!!");
        }
    }
    
    public void printDetails()
    {
       System.out.println("Module: " + moduleCode +
            " " + moduleTitle + " Mark = " + mark);
    }

   
}
