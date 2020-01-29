public class PublicPrivateLoader
{
    public static void main(String[] args)
    {
        PublicPrivateSample pps = new PublicPrivateSample(77, 35);

        System.out.println("Trying to print variables:");
        System.out.println(pps.Peeka);
        System.out.println(pps.Boo);
        pps.Peeka = "New String";
        System.out.println(pps.Peeka);
    }
}