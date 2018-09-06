
/**
 * Write a description of interface FractionInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Portion
{
    public Fraction add(Fraction a);
    public Fraction subtract(Fraction a);
    public Fraction multiply(Fraction a);
    public Fraction divide(Fraction a);
    public Fraction reciprocal();
    public String toString();
    public int comparesTo(Fraction a);
}
