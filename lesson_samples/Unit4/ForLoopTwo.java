public class ForLoopTwo
{
    public static void main(String[] args)
    {
        int foo = 100000;

        for(int i = 0; i <= foo; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}