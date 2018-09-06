
/**
 * Write a description of class Undergraduate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Undergraduate extends Student 
{
    private int level;   //1 for freshman, 2 for sophomore  //3 for junior, or 4 for senior.
    public Undergraduate() 
    {
        super();
        level = 1; 
    }

    public Undergraduate(String initialName, int initialStudentNumber, int initialLevel) 
    {
        super(initialStudentNumber,initialName);
        setLevel(initialLevel);  //checks 1 <= initialLevel <= 4 
    }

    public void reset(String newName, int newStudentNumber, int newLevel)
    {
        setName(newName);
        setStudentNumber(newStudentNumber);
        this.setLevel(newLevel);
    }

    public int getLevel() 
    {
        return level; 
    }

    public void setLevel(int newLevel) 
    {
        if ((1 <= newLevel) && (newLevel <= 4)) 
        {
            level = newLevel;
        }
        else
        {
            System.out.println("Illegal level!"); System.exit(0);
        }        
    }

    public void writeOutput() 
    {
        System.out.println("Name: " + getName());
        System.out.println("Number: " + getStudentNumber());
        System.out.println("Level: " + level); 
    }

    public boolean equals(Undergraduate otherUndergraduate) 
    {
        return equals((Student)otherUndergraduate) && (this.level == otherUndergraduate.level);
    }
}