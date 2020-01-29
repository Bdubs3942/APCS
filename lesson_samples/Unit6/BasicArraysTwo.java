public class BasicArraysTwo
{
    String[] bar;
    int[] foo;

    public static void main(String[] args)
    {
        // int[] foo = {34,22,56,43,25,12,42,43,43,43,21,31};

        // foo[3] = 0;

        // System.out.println(foo[3]);


        String[] bar = {new String("Solid Snake"), new String("Revolver Ocelot"), new String("Psycho Mantis")};
        System.out.println("The protagonist of Metal Gear Solid is " + bar[0] + ".");
        System.out.println("Two of the main antagonists of Metal Gear Solid are " + bar[1] + " and " + bar[2] + ".");
    }
}