public class BasicWhileLoopTwo
{
    public static void main(String[] args)
    {
        int foo = 1;
        int bar = 10000000;

        while(foo <= bar)
        {
            System.out.println(foo);
            foo++;
        }

        System.out.println();
        System.out.println("This line will not print until foo reaches 10.");
    }
}