
/**
 * The Student class represents a student in a student administration system.
 * It holds the student details such as name, id and credits.
 *
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 * modified by Georgia Gkegka
 */
public class Student
{
    // Attributes, Fields, Variables
    private String name;
    private String id;
    
    // A BSc course has 120 credits, each module has 15 credits
    private int credits;
    private Course course;
    
    /**
     * Create a new student with a given name and ID number.
     */
    
    public Student(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
        credits = 0;
    }
    

    /**
     * Return the full name of the student.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Set a new name of the student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }
    
    /**
     * Return the student ID of the student.
     */
    public String getStudentID()
    {
        return id;
    }
    
    /**
     * Add some credit points to the student's credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }
    
    /**
     * Return the number of credit points the student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }
    
    /**
     *  Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
    }
}