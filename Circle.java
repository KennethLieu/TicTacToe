
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle implements Measurable
{
    private int radius;
    
    public Circle()
    {
        this(2);
    }
    
    public Circle(int r)
    {
        radius = r;
    }
    
    public int getPerimeter()
    {
        return (int)Math.round(2*radius*Math.PI);
    }
    
    public int getArea()
    {
        return (int)Math.round(Math.PI*Math.pow(radius,2));
    }
}
