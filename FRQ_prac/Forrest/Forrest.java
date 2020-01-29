public class Forrest
{
    private Tree[] forrest = {new Tree("Oak", 12.4), new Tree("Maple", 8.3), new Tree("Fir", 6.4)};

    public static void main(String[] args)
    {
        Forrest f = new Forrest();

        for(int i = 0; i < f.forrest.length; i++)
        {
            System.out.println(f.forrest[i].getType() + " is " + f.forrest[i].getHeight() + " inches tall");
        }
    }
}