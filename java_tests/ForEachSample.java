public class ForEachSample
{
    public static void main(String[] args)
    {
        int[] foo = {1,2,3,4,5,6};

        for(int bar:foo)
        {
            System.out.println(bar+ "/" + foo.length);
        }
    }
}