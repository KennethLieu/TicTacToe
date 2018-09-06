
/**
 * Write a description of class Fraction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fraction implements Portion
{
    private int numerator;
    private int denominator;
    public Fraction()
    {
        this(1,2);
    }
    
    public Fraction(int n, int d)
    {
        this.numerator = n;
        try
        {
            this.denominator = d;
            if(this.denominator==0)
            {
                throw new Exception("Denominator is 0!");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() + " Generating random value(between 1 and 9) for denominator...");
            this.denominator = (int)(Math.random()*9)+1;
            System.out.println("New denominator: " + denominator);
        }
        int greatestCommonD = gcd(this.numerator,this.denominator);
        this.numerator/=greatestCommonD;
        this.denominator/=greatestCommonD;
    }
    
    public int gcd(int a, int b)
    {
        if(a<0)
        {
            a = -a;
        }
        if(b<0)
        {
            b = -b;
        }
        if(a%b==0)
        {
            return b;
        }
        else
        {
            return gcd(b,a%b);
        }
    }
    
    public Fraction add(Fraction a)
    {
        return new Fraction((this.numerator*a.denominator)+(a.numerator*this.denominator),(this.denominator*a.denominator));
    }
    
    public Fraction subtract(Fraction a)
    {
        return new Fraction((this.numerator*a.denominator)-(a.numerator*this.denominator),(this.denominator*a.denominator));
    }
    
    public Fraction multiply(Fraction a)
    {
        return new Fraction(this.numerator*a.numerator,this.denominator*a.denominator);
    }
    
    public Fraction divide(Fraction a)
    {
        return new Fraction(this.numerator*a.reciprocal().numerator,this.denominator*a.reciprocal().denominator);
    }
    
    public Fraction reciprocal()
    {
        return new Fraction(this.denominator,this.numerator);
    }
    
    public boolean equals(Fraction a)
    {
        return this.numerator==a.numerator && this.denominator==a.denominator;
    }
    
    public int comparesTo(Fraction a)
    {
        if(this.numerator*a.denominator==this.denominator*a.numerator)
        {
            return 0;
        }
        else if(this.numerator*a.denominator>this.denominator*a.numerator)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
    
    public String toString()
    {
        return this.numerator + "/" + this.denominator;
    }
}
