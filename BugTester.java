
/**
 * Write a description of class BugTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BugTester
{
    public static void main(String[] args)
    {
        Bug bug1 = new Bug();
        Bug bug2 = new Bug(3,true,"butterfly",6);
        bug1.move(5);
        bug2.move(-3);
        bug2.feed();
        System.out.println("Position of bug1: " + bug1.getPosition());
        System.out.println("Position of bug2: " + bug2.getPosition());
    }
}
