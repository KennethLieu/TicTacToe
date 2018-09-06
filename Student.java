
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person
{
    private int studentNumber;
    public Student()
    {
        super();
        studentNumber = 0;
    }
    
    public Student(int otherNumber, String oName)
    {
        super(oName);
        studentNumber = otherNumber;
    }
    
    public Student(String initialName)
    {
        this(0,initialName);
    }
    
    public void reset(String newN, int newNum)
    {
        studentNumber = newNum;
        setName(newN);
    }
    
    public int getStudentNumber()
    {
        return studentNumber;
    }
    
    public void setStudentNumber(int newNum)
    {
        studentNumber = newNum;
    }
    
    public void writeOutput()
    {
        System.out.println("Student Name: " + getName());
        System.out.println("Student Number: " + studentNumber);
    }
    
    public boolean equals(Student otherStudent)
    {
        return this.hasSameName(otherStudent)&&otherStudent.getStudentNumber()==this.studentNumber;
    }
}
