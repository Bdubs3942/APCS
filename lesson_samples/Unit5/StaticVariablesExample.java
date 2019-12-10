public class StaticVariablesExample
{
    public static String x;

    public StaticVariablesExample(String initX)
    {
        x = initX;
    }

    public static void setX(String newX)
    {
        x = newX;
    }

    public static String getX()
    {
        return x;
    }

    public static void main(String[] args)
    {
    }
}