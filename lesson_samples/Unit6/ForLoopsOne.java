public class ForLoopsOne
{
    String[] birds;

    public static void main(String[] args)
    {
        String[] birds = {"Zazu", "Toucan Sam", "Sam the Eagle", "Sonny the Cuckoo Bird"};

        for(int i = 0; i < birds.length; i++)
        {
            System.out.println(birds[i] + " is a bird.");
        }
    }
}