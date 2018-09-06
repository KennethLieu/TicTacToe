/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee extends Person
{
    private double annualSalary;
    private int date;
    private String id;
    public Employee()
    {
        super();
        annualSalary = 0.0;
        date = 0;
        id = "";
    }
    
    public Employee(String n, double aSalary, int d, String iD)
    {
        super(n);
        annualSalary = aSalary;
        date = d;
        id = iD;
    }
    
    public String getID()
    {
        return id;
    }
    
    public int getDate()
    {
        return date;
    }
    
    public double getSalary()
    {
        return annualSalary;
    }
    
    public void writeOutput()
    {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + annualSalary);
        System.out.println("Date: " + date);
        System.out.println("ID: " + id);
    }
    
    public boolean equals(Employee a)
    {
        return this.hasSameName(a) && a.getID().equals(id) && a.getDate()==date && a.getSalary()==annualSalary;
    }
}

