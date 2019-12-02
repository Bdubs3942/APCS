public class BreakSample
{
    public static void main(String[] args)
    {
        boolean isGreaterThanFive = false;
        int outerCounter = 0;

        for(int i = 0; i <=10; i++)
        {
            if(isGreaterThanFive)
            {
                break;
            }
            else
            {
                System.out.println("Loop still running.");
                outerCounter++;
                if(outerCounter >= 5)
                {
                    isGreaterThanFive = true;
                }
            }
        }
    }
}