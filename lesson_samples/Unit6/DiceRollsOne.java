public class DiceRollsOne
{
    OneThousandDiceRolls otdr = new OneThousandDiceRolls();
    int[] diceRolls = otdr.getDiceRolls(); 

    int total;

    public static void main(String[] args)
    {
        DiceRollsOne dro = new DiceRollsOne();
        dro.printDiceAverage(dro.diceRolls);
    }

    public void printDiceAverage(int[] dr)
    {
        for(int i = 0; i < dr.length; i++)
        {
            total += dr[i];
        }
        System.out.println(total/diceRolls.length);
    }
}