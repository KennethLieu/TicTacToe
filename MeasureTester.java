import java.util.*;
/**
 * Write a description of class MeasureTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MeasureTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int p = 0;
        int r = 0;
        int l = 0;
        try
        {
            r = in.nextInt();
            if(r < 1)
            {
                throw new Exception("Invalid dimension! Creating random radius value(from 1 to 9)... ");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            p = (int)(Math.random()*9)+1;
            System.out.println("Adjusted radius value: " + p + "\n");
            r = p;
        }
        System.out.print("Enter length of square: ");
        try
        {
            l = in.nextInt();
            if(l < 1)
            {
                throw new Exception("Invalid dimension! Creating random value for length of square(from 1 to 9)... ");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            p = (int)(Math.random()*9)+1;
            System.out.println("Adjusted length value: " + p + "\n");
            l = p;
        }
        Square sq = new Square(l);
        Circle c = new Circle(r);
        System.out.println("Perimeter of circle: " + c.getPerimeter());
        System.out.println("Area of circle: " + c.getArea());
        System.out.println("Perimeter of square: " + sq.getPerimeter());
        System.out.println("Area of square: " + sq.getArea());
    }
}
