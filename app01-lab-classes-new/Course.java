
/**
 * This class will store information on student's classes and numbers.
 *
 * @author Georgia Gkegka
 */
public class Course
{
    // Attributes,Variables,Fields
    private String title;
    private String codeNo;

    /**
     * Constructor for objects of class Course it stores the title 
     * and the code no
     */
    public Course(String title, String codeNo)
    {
        // initialise instance variables
        this.title = title;
        this.codeNo = codeNo;
    }

    /**
     * This will print out the title and codeNo
     */
    public void print()
    {
        // put your code here
         System.out.println("Course: " + title + " " + codeNo);
    }
}
