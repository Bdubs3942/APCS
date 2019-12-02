public class InfiniteLoop
{
    public static void main(String[] args)
    {        
        boolean foo = true;

        while(foo)
        {
            System.out.println("This simple example is going to print once.");
            //foo = false;
        }
    }
}