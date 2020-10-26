
/**
 * This class will store information on student's classes and numbers.
 *
 * @author (Georgia)
 * @version (a version number or a date)
 */
public class Course
{
    // Attributes, Variable, Fields
    private String title;
    private String codeNo;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int finalMark;
    
    private Grades finalGrade;

    /**
     * Constructor for objects of class Course it stores the title 
     * and the code no
     */
    public Course(String title, String codeNo)
    {
        // initialise instance variables
        this.title = title;
        this.codeNo = codeNo;
        
        module1 = new Module("Maths", "M1546");
        module2 = new Module("Chemistry", "C1432");
        module3 = new Module("English", "E1789");
        module4 = new Module("Programming Concepts","PC2579");
    }
    
    public void addMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
        if(moduleNo == 2)
        {
            module2.awardMark(mark);
        }
        if(moduleNo == 3)
        {
            module3.awardMark(mark);
        }
        if(moduleNo == 4)
        {
            module4.awardMark(mark);
        }
    }

    /**
     * This will print out the title and codeNo
     */
    public void print()
    {
        // put your code here
         System.out.println("Course: " + title + " " + codeNo);
    }
    
    public Grades convertToGrade(int mark)
    {
        if((mark >= 0) && (mark < 40))
        {
            return Grades.F;
        }
        
          return Grades.X;
    }
}
