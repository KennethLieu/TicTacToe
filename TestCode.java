
/**
 * Write a description of class TestCode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestCode
{
    public static void main(String[] args)
    {
        int[][] testArray = new int[3][4];
        for (int row = 0; row < testArray.length; row++)
        {
            for (int col = 0; col < testArray[row].length; col++)
            {
                testArray[row][col] = col;
            }
        }
        for (int row = 0; row < testArray.length; row++)
        {
            for (int col = 0; col < testArray[row].length; col++)
            {
                System.out.print(testArray[row][col] + " ");
            }
            System.out.println();
        }
    }
}
