import javax.swing.JOptionPane;
/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factorial
{
    public static void main(String[] args)
    {
        int a = JOptionPane.showConfirmDialog(null,"Find factorial of a certain number?", "Click Yes or No", JOptionPane.YES_NO_OPTION);
        if(a == JOptionPane.YES_OPTION)
        {
            String f = JOptionPane.showInputDialog("Enter number to find factorial of: ");
            int fact = Integer.parseInt(f);            
            JOptionPane.showMessageDialog(null, "Number to find factorial: " + fact + "\n" + "Factorial: " + findFactorial(fact));
            
        }
        else if(a==JOptionPane.NO_OPTION)
        {
            JOptionPane.showMessageDialog(null,"Ending program...");            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid choice!");
        }
        System.exit(0);
    }
    
    public static long findFactorial(int a)
    {
        long b = 1;
        for(int i = a; i >= 1; i--)
        {
            b *= i;
        }
        return b;
    }
}
