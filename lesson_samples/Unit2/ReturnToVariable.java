public class ReturnToVariable
{
    public static void main(String[] args)
    {
        int z = addingMachine(4, 6);
        System.out.println(z);
    }

    public static int addingMachine(int x, int y)
    {
        return x+y;
    }
}