/**
 * Write a description of class TesterC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TesterC
{
    public static void main(String[] args)
    {
        Truck c = new Truck();
        Truck d = new Truck(new Person("Jack"), "James", 5, 6, 7);
        c.writeOutput();
        System.out.println();
        d.writeOutput();
    }
}
