import java.util.*;
/**
 * Write a description of class FractionTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FractionTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numerator value for fraction 1: ");
        int a = in.nextInt();
        System.out.print("Enter denominator value for fraction 1: ");
        int b = in.nextInt();
        System.out.print("Enter numerator value for fraction 2: ");
        int c = in.nextInt();
        System.out.print("Enter denominator value for fraction 2: ");
        int d = in.nextInt();
        Fraction f1 = new Fraction(a,b);
        Fraction f2 = new Fraction(c,d);
        System.out.println();
        System.out.println("Fraction 1: ");
        System.out.println(f1.toString() + "\n");
        System.out.println("Fraction 2: ");
        System.out.println(f2.toString() + "\n");
        System.out.println("Addition result: " + f1.add(f2).toString());
        System.out.println("Difference result: " + f1.subtract(f2).toString());
        System.out.println("Product result: " + f1.multiply(f2).toString());
        System.out.println("Quotient result: " + f1.divide(f2).toString());
        System.out.println("Reciprocal of f1: " + f1.reciprocal().toString());
        System.out.println("Reciprocal of f2: " + f2.reciprocal().toString());
        if(f1.equals(f2))
        {
            System.out.println(f1.toString() + " is equivalent to " + f2.toString());
        }
        else
        {
            System.out.println(f1.toString() + " is NOT equivalent to " + f2.toString());
        }
        
        if(f1.comparesTo(f2)==0)
        {
            System.out.println(f1.toString() + " is equivalent to " + f2.toString());
        }
        else if(f1.comparesTo(f2)>0)
        {
            System.out.println(f1.toString() + " is greater than " + f2.toString());
        }
        else
        {
            System.out.println(f1.toString() + " is less than " + f2.toString());
        }
    }
}
