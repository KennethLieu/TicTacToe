import javax.swing.JOptionPane;
/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Date
{
    public static void main(String[] args)
    {
        String a = JOptionPane.showInputDialog("Enter date: ");
        boolean c = isValidDate(a);
        System.exit(0);
    }
    
    public static boolean isValidDate(String a)
    {
        String[] b = a.split("/",3);
        boolean c = false;
        if(Integer.parseInt(b[2])%400==0)
        {
            c = Integer.parseInt(b[2])%100==0;
        }
        else
        {
            c = Integer.parseInt(b[2])%100!=0;
        }
        for(int i = 0; i < b.length; i++)
        {
            switch(i)
            {
                case 0:
                if(Integer.parseInt(b[i])>12||Integer.parseInt(b[i])<1)
                {
                    displayMessage("Invalid date! Reasoning: Invalid input of month!");
                    return false;
                }
                break;
                case 1:
                int d = 0;
                if(Integer.parseInt(b[0])==1||Integer.parseInt(b[0])==3||Integer.parseInt(b[0])==5||Integer.parseInt(b[0])==7||Integer.parseInt(b[0])==8||Integer.parseInt(b[0])==10||Integer.parseInt(b[0])==12)
                {
                    d = 31;
                }
                else if(Integer.parseInt(b[0])==4||Integer.parseInt(b[0])==6||Integer.parseInt(b[0])==9||Integer.parseInt(b[0])==11)
                {
                    d = 30;
                }
                else if(Integer.parseInt(b[0])==2&&Integer.parseInt(b[2])%4==0 && c)
                {
                    d = 29;
                }
                else
                {
                    d = 28;
                }
                if(Integer.parseInt(b[i])>d || Integer.parseInt(b[i])<1)
                {
                    displayMessage("Invalid date! Reasoning: Invalid input of day!");
                    return false;
                }
                break;
            }
        }
        displayMessage("Valid date!");
        return true;
    }
    public static void displayMessage(String a)
    {
        JOptionPane.showMessageDialog(null,a);
    }
}
