public class BasicArraysOne
{
    String[] bar;

    public static void main(String[] args)
    {
        String[] bar = new String[3];
        bar[0] = new String("Solid Snake");
        bar[1] = new String("Revolver Ocelot");
        bar[2] = new String("Psycho Mantis");
        
        System.out.println("The protagonist of Metal Gear Solid is " + bar[0]);
        System.out.println("Two of the main antagonists of Metal Gear Solid are " + bar[1] + " and " + bar[2] + ".");
    }
}