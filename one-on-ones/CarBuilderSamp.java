public class CarBuilderSamp{
    public static void main(String[] args)
    {
        String foo = "Bugatti";
        Car x = new Car(2019, 1000, foo, "Chiron");
        
        System.out.println(x);
        System.out.println(x.year);
        System.out.println(x.manufacturerName);
    }
}