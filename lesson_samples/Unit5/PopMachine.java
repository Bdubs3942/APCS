public class PopMachine
{
    //1. Base constructor
    //2. Use constructor
    //3. Overload constructor
    public static void main(String[] args)
    {
       NewGlass coke = new NewGlass();
       NewGlass mountainDew = new NewGlass("Mountain Dew");

        System.out.println(coke.getTypeOfPop() + " melts teeth.");
        System.out.println(mountainDew.getTypeOfPop() + " is sooo extreme!");
    }
}