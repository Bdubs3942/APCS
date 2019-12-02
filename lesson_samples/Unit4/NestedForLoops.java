public class NestedForLoops
{
    public static void main(String[] args)
    {
        int column = 3;
        int row = 5;

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}