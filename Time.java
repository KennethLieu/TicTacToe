import javax.swing.*;
/**
 * Write a description of class Time here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Time
{
    public static void main(String[] args)
    {
        String timer = JOptionPane.showInputDialog("Enter before time: ");
        String timer1 = JOptionPane.showInputDialog("Enter after time: ");        
        String[] before = timer.split(":",3);
        String[] after = timer1.split(":",3);
        String[] beforeLast = before[before.length-1].split(" ", 2);
        String[] afterLast = after[after.length-1].split(" ", 2);
        before[before.length-1] = beforeLast[0];
        after[after.length-1] = afterLast[0];
        String beforeSignal = beforeLast[1];
        String afterSignal = afterLast[1];
        int[] time1 = new int[3];
        int[] time2 = new int[3];
        for(int i = 0; i < time1.length; i++)
        {
            time1[i] = Integer.parseInt(before[i]);
            time2[i] = Integer.parseInt(after[i]);
        }
        boolean h = false;
        boolean g = false;
        boolean f = false;
        int[] timeDiff = new int[3];
        for(int i = 0; i < time1.length; i++)
        {
            if(i==0)
            {
                h = isOneHourApart(time1,time2,beforeSignal,afterSignal);
            }
            else if(i==1) 
            {
                h = isOneMinuteApart(time1,time2);
            }
            else
            {
                h = (time1[2]!=time2[2]);
            }
            while(h==true)
            {
                switch(i)
                {
                    case 0:
                    time1[0]++;
                    if(time1[0]==13)
                    {
                        time1[0] = 1;                        
                    }
                    if(time1[0]==12)
                    {
                        if(beforeSignal.equals("AM"))
                        {
                            beforeSignal = "PM";
                        }
                        else
                        {
                            beforeSignal = "AM";
                        }
                    }
                    timeDiff[i]++;
                    h = isOneHourApart(time1,time2,beforeSignal,afterSignal);
                    break;
                    case 1:
                    time1[1]++;
                    if(time1[1]==60)
                    {
                        time1[1] = 0;
                    }
                    timeDiff[i]++;
                    h = isOneMinuteApart(time1,time2);
                    break;
                    case 2:
                    time1[2]++;
                    if(time1[2]==60)
                    {
                        time1[2] = 0;
                    }
                    timeDiff[i]++;
                    h = (time1[2]!=time2[2]);
                    break;
                }
            }           
        }
        JOptionPane.showMessageDialog(null,"Before time: " + timer + "\n" + "After time: " + timer1 + "\n" + "Hours: " + timeDiff[0] + "\n" + "Minutes: " + timeDiff[1] + "\n" + "Seconds: " + timeDiff[2]);
    }

    public static boolean isOneHourApart(int[] a, int[] b, String aSignal, String bSignal)
    {
        if(aSignal.equals(bSignal))
        {
            if(a[0]!=b[0])
            {
                if(a[0]+1==b[0]||(a[0]==12&&b[0]==1))
                {
                    return tester(a[1],a[2],b[1],b[2],aSignal,bSignal);
                }
                return true;
            }
            else
            {
                if(a[1]>b[1])
                {
                    return true;
                }
                else
                {
                    if(a[2]>b[2]&&a[1]==b[1])
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }  
        return true;
    }

    public static boolean tester(int aMin, int aSec, int bMin, int bSec, String sig1, String sig2)
    {
        if(aMin > bMin)
        {
            return false;
        }
        if(aMin == bMin)
        {
            if(aSec<=bSec)
            {
                return true;
            }
            return false;
        }
        else
        {
            return true;
        }
    }

    public static boolean test(int aSec, int bSec)
    {
        if(aSec<=bSec)
        {
            return true; 
        }
        return false;
    }

    public static boolean isOneMinuteApart(int[] a, int[] b)
    {
        if(a[1]!=b[1])
        {
            if(a[1]+1==b[1]||(a[1]==59&&b[1]==0))
            {
                return test(a[2],b[2]);
            }
            return true;
        }
        if(a[1]==b[1])
        {
            if(a[2]<b[2])
            {
                return false;
            }
        }
        return true;
    }
}

