public class ScratchUTwo
{
    static String foo;

    public static void main(String[] args)
    {
        if (foo == null)
        {
            System.out.println("Yep, it's initialized to null.");
        }
        else
        {
            System.out.println("Nope, it's something.");
        }
    }
}