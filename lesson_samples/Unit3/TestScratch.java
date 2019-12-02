import javax.lang.model.util.ElementScanner6;

public class TestScratch
{
    public static void main(String[] args)
    {
        double price;
        double baseCost;
        double margin = 0.5;

        int amountOrdered = 55;

        if (amountOrdered <= 10)
        {
            baseCost = 5.0;
        }
        else if (amountOrdered > 10 && amountOrdered <= 25)
        {
            baseCost = 4.5;
        }
        else if (amountOrdered > 25 && amountOrdered <= 50)
        {
            baseCost = 4.0;
        }
        else
        {
            baseCost = 3.0;
        }
        price = baseCost + (baseCost * margin);
        System.out.println(price);
    }
}