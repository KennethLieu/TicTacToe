/**
 * Write a description of class Doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends Person
{
    private String specialty;
    private double officeVisitFee;
    
    public Doctor()
    {
        super();
        specialty = "";
        officeVisitFee = 0.0;
    }
    
    public Doctor(String rName, String spe, double officeFee)
    {
        super(rName);
        specialty = spe;
        officeVisitFee = officeFee;
    }
    
    public double getFee()
    {
        return officeVisitFee;
    }
    
    public String getSpecialty()
    {
        return specialty;
    }
    
    public void writeOutput()
    {
        System.out.println("Name: " + getName());
        System.out.println("Specialty: " + specialty);
        System.out.println("Office Visit Fee: " + officeVisitFee);
    }
    
    public boolean equals(Doctor d)
    {
        return this.hasSameName(d) && d.getFee()==officeVisitFee && d.getSpecialty().equalsIgnoreCase(specialty);
    }
}

