
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square implements Measurable
{
    private int dimension;
    
    public Square()
    {
        this(2);
    }
    
    public Square(int x)
    {
        dimension = x;
    }
    
    public int getPerimeter()
    {
        return dimension*4;
    }
    
    public int getArea()
    {
        return dimension*2;
    }
}
