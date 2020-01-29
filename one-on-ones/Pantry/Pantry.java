public class Pantry
{
    FoodItem chicken = new FoodItem("Chicken", 4);
    FoodItem beef = new FoodItem("Beef", 4);

    public static void main(String[] args)
    {
        Pantry p = new Pantry();
        //System.out.println(p.chicken.name);
        System.out.println(p.chicken.getName());
    }
}