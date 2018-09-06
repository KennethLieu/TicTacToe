
/**
 * Write a description of class CounterClient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CounterClient
{
    public static void main(String[] args)
    {
        Counter c = new Counter(5);
        c.setCount(17);
        c.increaseCount();
        c.increaseCount();
        c.decreaseCount();
        System.out.println("Number of counts: " + c.getCount());
        if(c.equalsZero()==true)
        {
            System.out.println("No counts remaining!");
        }
        System.out.println(c.toString());
    }
}
