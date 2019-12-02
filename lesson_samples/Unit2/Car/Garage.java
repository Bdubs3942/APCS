public class Garage
{
    public static void main(String[] args)
    {
        // year, milesDriven, manufacturerName, modelName, hasTurbo

        Car foo = new Car();

        System.out.println(foo.modelName);

        Car x = new Car(2016, 26_000, "Honda", "Civic");

        System.out.println(x.modelName);

        Car jumper = new Car(2004, 5_000, "Wayne Industries", "Batmobile", true);

        System.out.println(jumper.milesDriven);
        System.out.println("Does it have turbo? " +jumper.hasTurbo);
        jumper.engageTurbo();

    }
}