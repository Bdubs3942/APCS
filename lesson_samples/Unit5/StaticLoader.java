public class StaticLoader
{
    public static void main(String[] args)
    {
        StaticVariablesExample sve1 = new StaticVariablesExample("This is the first object");
        StaticVariablesExample sve2 = new StaticVariablesExample("Second object here");
        StaticVariablesExample sve3 = new StaticVariablesExample("Number three reporting in");

        System.out.println(sve1.getX());
        System.out.println(sve2.getX());
        System.out.println(sve3.getX());

        sve2.setX("This is Two");

        System.out.println(sve1.getX());
        System.out.println(sve2.getX());
        System.out.println(sve3.getX());
    }
}