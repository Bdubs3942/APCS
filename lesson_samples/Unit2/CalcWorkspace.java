public class CalcWorkspace
{
    public static void main(String[] args)
    {
        ReturningCalculator calc = new ReturningCalculator();
        int aNumber = 10;
        
        int anotherNumber = calc.integerAdder(2,3);

        int addedNumbers = aNumber + anotherNumber;

        System.out.println(aNumber);
    }
}