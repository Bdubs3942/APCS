public class TraceTableExample
{
    public static void main(String[] args)
    {
        String animal = "Pony";

        for(int i = 0; i < animal.length(); i++)
        {
            System.out.println(animal.substring(i, i+1));
        }
    }
}