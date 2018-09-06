
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args)
    {
        Person person = new Student(999,"Sam");
        person.writeOutput();
        Undergraduate ug = new Undergraduate("Sam",999,1);
        Person p = (Person)ug;
        p.writeOutput();
    }
}
