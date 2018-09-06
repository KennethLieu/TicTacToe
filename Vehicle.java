/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    private String nameManufacturer;
    private int numCylinders;
    private Person owner;
    
    public Vehicle()
    {
        nameManufacturer = "";
        numCylinders = 0;
        owner = new Person();
    }
    
    public Vehicle(Person a, String n, int num)
    {
        owner = a;
        nameManufacturer = n;
        numCylinders = num;
    }
    
    public void writeOutput()
    {
        System.out.println("Owner: " + owner.getName());
        System.out.println("Name of manufacturer: " + nameManufacturer);
        System.out.println("Number of cylinders: " + numCylinders);
    }
    
    public int getCylinders()
    {
        return numCylinders;
    }
    
    public String getManufacturer()
    {
        return nameManufacturer;
    }
    
    public Person getOwner()
    {
        return owner;
    }
}

