import java.util.*;
/**
 * Write a description of class Numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Numbers implements Number
{
    private int x;
    public Numbers(int a)
    {
        x = a;
    }

    public int getSmallest(List<Integer> a)
    {
        int small = 1000000;
        if(a.size()==1)
        {
            return a.get(0);
        }
        else
        {
            for(int c: a)
            {
                if(c<small)
                {
                    small = c;
                }
            }
        }
        return small;
    }
    
    public int getSecondSmallest(List<Integer> a)
    {
       int small = 1000000;
       int ind = -1;
       if(a.size()==1)
       {
           return 0;
       }
       else
       {
           for(int i = 0; i < a.size(); i++)
           {
               if(small>a.get(i))
               {
                   ind = i;
                   small = a.get(i);
               }
           }
           a.remove(ind);
           ind = -1;
           small = 1000000;
           for(int i = 0; i < a.size(); i++)
           {
               if(small>a.get(i))
               {
                   ind = i;
                   small = a.get(i);
               }
           }
       }
       return a.get(ind);
    }
    
    public double getAverage(List<Integer> a)
    {
        int sum = 0;
        for(Integer c: a)
        {
            sum += c;
        }
        return (double)sum/a.size();
    }
    
}