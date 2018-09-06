/**
 * Write a description of class TesterB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TesterB
{
    public static void main(String[] args)
    {
        Doctor e = new Doctor();
        Doctor f = new Doctor();
        boolean check = e.equals(f);
        System.out.println("Equals: " + check);
        Doctor g = new Doctor("Trang", "Pediatrician", 150);
        Doctor h = g;
        Doctor i = new Doctor("Tranh", "Pediatrician", 150);
        g.writeOutput();
        h.writeOutput();
        i.writeOutput();
        System.out.println(g.equals(h));
        System.out.println(h.equals(i));
    }
}

