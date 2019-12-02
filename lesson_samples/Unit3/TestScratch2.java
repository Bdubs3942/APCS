public class TestScratch2
{
    public static void main(String[] args)
    {
        // int x = 4;
        // int y = 0;
        // int z = -2;

        // if(x - 2 == z)
        // {
        //     y = 7;
        // }
        // else if(x - 6 == z)
        // {
        //     y = 8;
        // }
        // else
        // {
        //     y = 9;
        // }


        String foo = "doghouse";
        String bar = foo.substring(0, 3);

        if (bar.equals("house"))
        {
            System.out.println(foo.substring(3));
        }
        else if (foo == "dog")
        {
            System.out.println(bar);
        }
        else
        {
            System.out.println(foo);
        }

    }
}