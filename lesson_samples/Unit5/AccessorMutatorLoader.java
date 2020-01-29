public class AccessorMutatorLoader
{
    public static void main(String[] args)
    {
        AccessorMutatorSample as = new AccessorMutatorSample("Cecelia");

        System.out.println(as.getName() + " goes to " + as.getSchool() + ".");
        System.out.println("Their new super secret Government Issued ID is unavailable");
        as.setName("Bond");
        System.out.println("Her new spy name is " + as.getName() + ".");

    }
}