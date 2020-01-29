public class HorseBarn
{
    // private Horse[] barn = new Horse[2];

    // barn = {("Coffee", 635), ("Pickles", 625)};

    private Horse[] barn = {new Horse("Coffee", 635), new Horse("Pickles", 625)};

    // A[] a = new A[] { new A("args"), new A("other args"), .. };

    public int findHorseSpace(String name)
    {
        int index = -1;

        for(int i = 0; i < barn.length; i++)
        {
            if(name == barn[i].getName())
            {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        HorseBarn hb = new HorseBarn();

        // for(int i = 0; i < 3; i++)
        // {
        //     System.out.println(hb.barn[i].getName() + " weighs " + hb.barn[i].getWeight() + " pounds.");
        // }
        int horseSpace = hb.findHorseSpace("Coffee");

        System.out.println(horseSpace);
    }
}