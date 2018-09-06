/**
 * Write a description of class Truck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Truck extends Vehicle
{
    private double loadCapacity;
    private double towingCapacity;
    
    public Truck()
    {
        super();
        loadCapacity = 0.0;
        towingCapacity = 0.0;
    }
    
    public Truck(Person b, String s, int n, double l, double t)
    {
        super(b,s,n);
        loadCapacity = l;
        towingCapacity = t;
    }
    
    public void writeOutput()
    {
        System.out.println("Loading Capacity: " + loadCapacity);
        System.out.println("Towing Capacity: " + towingCapacity);
        System.out.println("Number of cylinders: " + getCylinders());
        System.out.println("Manufacturer name: " + getManufacturer());
        System.out.println("Owner: " + getOwner().getName());
    }
    
    public double getTow()
    {
        return towingCapacity;
    }
    
    public double getLoad()
    {
        return loadCapacity;
    }
}

