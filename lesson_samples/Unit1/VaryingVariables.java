public class VaryingVariables
{
    public static void main(String[] args)
    {
        int num = 7;

        System.out.println("The current number is " + num + ".");
        num = 42;
        System.out.println("The current number is " + num + ".");
        num = 3_000;
        System.out.println("The current number is " + num + ".");
        num = 2_000_000_000;
        System.out.println("The current number is " + num + ".");
        num = 8;
        System.out.println("The current number is " + num + ".");
    }
}