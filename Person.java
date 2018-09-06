/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    public Person()
    {
        name = "No name yet";
    }
    
    public Person(String oName)
    {
        name = oName;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void writeOutput()
    {
        System.out.println("Name: " + name);
    }
    
    public boolean hasSameName(Person o)
    {
        return this.name.equalsIgnoreCase(o.name);
    }
}

