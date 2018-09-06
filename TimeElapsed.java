import javax.swing.*;
/**
 * Write a description of class TimeElapsed here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TimeElapsed
{
    public static void main(String[] args)
    {
        String bef = JOptionPane.showInputDialog("Enter a time(before): ");
        String aft = JOptionPane.showInputDialog("Enter a time(after): ");
        int[] arr = getDiffInTime(bef,aft);
        for(int i = 0; i < arr.length; i++)
        {
            switch(i)
            {
                case 0: JOptionPane.showMessageDialog(null,"Hours: " + arr[i]);break;
                case 1: JOptionPane.showMessageDialog(null,"Minutes: " + arr[i]);break;
                case 2: JOptionPane.showMessageDialog(null,"Seconds: " + arr[i]);break;
            }
        }
    }

    public static int[] getDiffInTime(String a, String b)
    {
        String[] r = a.split(":", 3);
        String[] s = b.split(":", 3);
        String used = r[r.length-1];
        String used1 = s[s.length-1];
        String[] aged = used.split(" ");
        String[] aged1 = used1.split(" ");
        r[r.length-1] = aged[0];
        s[s.length-1] = aged1[0];
        int[] arr = new int[3];
        int[] arr1 = new int[3];
        int[] timeDiff = new int[3];
        boolean h = false;
        boolean g = false;
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(r[i]);
            arr1[i] = Integer.parseInt(s[i]);
        }
        if(arr[0]==arr1[0])
        {
            if(arr[1]>arr1[1])
            {
                h = arr[1]!=arr1[1];
            }
            else
            {
                h = arr[2]!=arr1[2];
            }
        }
        for(int i = 0; i < arr.length; i++)
        {
            while(h==true)
            {
                switch(i)
                {
                    case 0:
                    arr[0]++;
                    if(arr[0]==13)
                    {
                        arr[0] = 1;
                    }
                    timeDiff[0]++;
                    break;
                    case 1:
                    arr[1]++;
                    if(arr[1]==60)
                    {
                        arr[1] = 0;
                    }
                    timeDiff[1]++;
                    break;
                    case 2:
                    arr[2]++;
                    if(arr[2]==60)
                    {
                        arr[2] = 0;
                    }
                    timeDiff[2]++;
                    break;
                }
            }
        }
        return timeDiff;
    }
}
