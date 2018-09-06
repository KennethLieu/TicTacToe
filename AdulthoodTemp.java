import javax.swing.JOptionPane;
/**
 * Write a description of class adulthood here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdulthoodTemp
{
    public static void main(String[] args)
    {
        int a = JOptionPane.showConfirmDialog(null,"Are you at least 18 years old?", "Click Yes or No", JOptionPane.YES_NO_OPTION);
        boolean adult = false;
        if(a == JOptionPane.YES_OPTION)
        {
            adult = true;
        }
        JOptionPane.showMessageDialog(null, "Adulthood: " + adult);
        System.exit(0);
    }
}
