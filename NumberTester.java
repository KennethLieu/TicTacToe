import java.util.*;
/**
 * Write a description of class NumberTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberTester
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter length of list of numbers: ");
       int a = in.nextInt();
       List<Integer> ints = new ArrayList<Integer>();
       Numbers c = new Numbers(6);
       for(int i = 0; i < a; i++)
       {
           System.out.println("Enter values for number: ");
           ints.add(in.nextInt());
       }
       System.out.println();
       System.out.println("Average values: " + c.getAverage(ints));
       System.out.println("Smallest: " + c.getSmallest(ints));
       System.out.println("Second smallest: " + c.getSecondSmallest(ints));    
    }
}
