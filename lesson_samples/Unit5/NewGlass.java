public class NewGlass
{
    private String typeOfPop;

    public NewGlass()
    {
        this.typeOfPop = "Coca-Cola";
    }

    public NewGlass(String typeOfPop)
    {
        this.typeOfPop = typeOfPop;
        System.out.println("Made a Mountain Dew.");
    }

    public String getTypeOfPop()
    {
        return typeOfPop;
    }

    public static void main(String[] args)
    {
    }
}