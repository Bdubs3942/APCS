public class RandomGenerator
{
    public static void main(String[] args)
    {
        RandomGenerator rg = new RandomGenerator();

        rg.randomPositiveInt(1_000);
    }

    public void randomPositiveInt(int totalNum)
    {
        for(int i = 0; i < totalNum; i++)
        {
            System.out.print(((int) (Math.random() * 100 +1)) + ",");
        }
    }
}