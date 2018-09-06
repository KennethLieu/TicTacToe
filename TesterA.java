
/**
 * Write a description of class TesterA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TesterA
{
    public static void main(String[] args)
    {
        Person p = new Person();
        Employee e = new Employee("peace",15,1988,"WE324");
        e.setName("Loren");
        Employee f = new Employee();
        Employee g = e;
        e.writeOutput();
        f.writeOutput();
        g.writeOutput();
        System.out.println("Equals: " + g.equals(e));
        Person q = new Person("Bob");
        p.writeOutput();
        q.writeOutput();
    }
}
