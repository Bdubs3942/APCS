public class AnalyzePN
{
    OneThousandPositiveOrNegativeInts pn = new OneThousandPositiveOrNegativeInts();

    public static void main(String[] args)
    {
        AnalyzePN apn = new AnalyzePN();

        apn.tabulatePN(apn.pn.getOneThousandPositiveOrNegativeInts());
    }

    public void tabulatePN(int[] foo)
    {
        int totalPositive = 0;
        int totalNegative = 0;

        for(int i = 0; i < foo.length; i++)
        {
            if(foo[i] >= 0)
            {
                totalPositive += foo[i];
            }
            else
            {
                totalNegative += foo[i];
            }
        }

        System.out.println("The total positive equals " + totalPositive);
        System.out.println("The total negative equals " + totalNegative);
    }
}