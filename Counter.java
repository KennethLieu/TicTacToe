
/**
 * Write a description of class Counter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Counter implements Count
{
    private int count;
    
    public Counter()
    {
        this(0);
    }
    
    public Counter(int c)
    {
        count = c;
    }
    
    public void setCount(int c)
    {
        count = c;
    }
    
    public int getCount()
    {
        return count;
    }
    
    public String toString()
    {
        return "Number of counts: " + count;
    }
    
    public boolean equalsZero()
    {
        return count==0;
    }
    
    public void increaseCount()
    {
        count++;
    }
    
    public void decreaseCount()
    {
        try
        {
            count--;
            if(count < 0)
            {
                throw new Exception("Count has been assigned a negative value! Reassigning to random value(between 1 and 9)...");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            count = (int)(Math.random()*9)+1;
            System.out.println("New value: " + count);
        }
    }
}
