
/**
 * This class will store information on student's classes and numbers.
 *
 * @author (Georgia)
 * @version (a version number or a date)
 */
public class Course
{
    // Attributes, Variable, Fields
    private String courseTitle;
    private String courseCode;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private double finalMark;
     
    
    private double finalGrade;
    
    private Grades gradeLetter;
    private String studentGrade;

    /**
     * Constructor for objects of class Course it stores the title 
     * and the code no
     */
    public Course(String courseTitle, String courseCode)
    {
        // initialise instance variables
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
        
        module1 = new Module("Programming Concepts", "M1546");
        module2 = new Module("Web Development", "C1432");
        module3 = new Module("Computer Architecture", "E1789");
        module4 = new Module("Digital Technologies","PC2579");
    }
    
    public void addModule(Module module,int moduleCode) 
    {
        
    }
    
    /**
     * Add marks to the modules, if it doesn't exist
     * an error message is displayed.
     */
    public void addMark(int mark, int moduleCode)
    {
        if(moduleCode == 1)
        {
            module1.awardMark(mark);
        }
        else if(moduleCode == 2)
        {
            module2.awardMark(mark);
        }
        else if(moduleCode == 3)
        {
            module3.awardMark(mark);
        }
        else if(moduleCode == 4)
        {
            module4.awardMark(mark);
        }
        else
        {
            System.out.println("Please input a valid module code!!");
        }
    }
    
    /**
     * Marks are converted into a percentage and 
     * are displayed to the user
     */
    public void calculateFinalMark()
    {
         finalMark = module1.mark + module2.mark + module3.mark + module4.mark;
        finalGrade = Math.round((finalMark / 400) * 100);
        System.out.println("Your marks  "  + courseTitle + 
        ", " + courseCode + " are: " + finalMark);
        System.out.println("Your course percentage is: " + finalGrade + "%");
    }
    
    /**
     * This class shows the final grade of the student.
     */
    public Grades convertToGrade(int mark)
    {
        if((finalGrade >= 0) && (finalGrade < 40))
        {
            studentGrade = ("F");
            return Grades.F;
        }
        else if ((finalGrade >= 40) && (finalGrade <= 49))
        {
            studentGrade = ("D");
            return Grades.D;
        }
        else if((finalGrade >= 50) && (finalGrade <= 59))
        {
            studentGrade = ("C");
            return Grades.C;
        }
        else if((finalGrade >= 60) && (finalGrade <= 69))
        {
            studentGrade = ("B");
            return Grades.B;
        }
        else if ((finalGrade>= 70))
        {
            studentGrade = ("A");
            return Grades.A;
        }
        else
        {
            studentGrade = ("X");
            return Grades.X;
        }
        
          
    }
    
    /**
     * This will print out the title and the code of the course
     */
    public void print()
    {
        // put your code here
         System.out.println("Course: " + courseTitle + " " + courseCode);
    }
    
     public void printModuleDetails()
    {
        System.out.println("       ");
        module1.printDetails();
        System.out.println("       ");
        module2.printDetails();
        System.out.println("       ");
        module3.printDetails();
        System.out.println("       ");
        module4.printDetails();
    }
    
    public void printFinalGrade()
    {
        System.out.println("Your final grade for " + courseTitle +
        (", ") + courseCode + (" is: ") + studentGrade);
    }
}
