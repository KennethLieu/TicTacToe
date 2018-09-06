/**
 * Write a description of class TitledPerson here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TitledPerson extends Person
{
    private String title;
    public TitledPerson()
    {
        super();
        title = "";
    }
    
    public TitledPerson(String n, String t)
    {
        super(n);
        title = t;
    }
    
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Title: " + title);
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void reset(String n, String t)
    {
        setName(n);
        title = t;
    }
    
    public boolean equals(TitledPerson a)
    {
        return hasSameName((Person)a) && a.getTitle().equals(this.title);
    }
    
    public void setTitle(String o)
    {
        title = o;
    }
}

