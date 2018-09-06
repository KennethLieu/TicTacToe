
/**
 * Write a description of class Bug here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bug
{
    private int position;
    private boolean isHungry;
    private String species;
    private int age;
    public Bug()
    {
        this(0, false, "", 0);
    }    
    public Bug(int p, boolean hung, String sp, int a)
    {
        position = p;
        isHungry = hung;
        species = sp;
        age = a;
    }    
    public void move(int positionAdjust)
    {
        position += positionAdjust;
    }    
    public void feed()
    {
        if(isHungry == true)
        {
            age++;
            isHungry = false;
        }
    }    
    public int getPosition()
    {
        return position;
    }
}
