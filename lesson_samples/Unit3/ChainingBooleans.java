public class ChainingBooleans
{
    public static void main(String[] args)
    {
        //System.out.println("Hello World");

        boolean isCurrentlyRunning = true;
        int gasLevel = 22;
        String currentDriver = "Mac";

        if (!(isCurrentlyRunning) && !(gasLevel > 50) || currentDriver.equals("Mac"))
        {
            System.out.println("Let’s go!");
        }
        else
        {
        System.out.println("It won’t run!");
        }

    }
}