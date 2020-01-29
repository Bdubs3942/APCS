public class RandomGeneratorPN
{
    public static void main(String[] args)
    {
        RandomGeneratorPN rg = new RandomGeneratorPN();

        rg.randomPositiveInt(1_000);
    }

    public void randomPositiveInt(int totalNum)
    {
        int limits = 1_000_000;
        for(int i = 0; i < totalNum; i++)
        {
            if(Math.random() > 0.5)
            {
                System.out.print(((int) (Math.random() * limits +1)) + ",");
            }
            else
            {
                System.out.print("-"+((int) (Math.random() * limits +1)) + ",");
            }
        }
    }
}