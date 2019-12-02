public class Aliases
{
    public static void main(String[] args)
    {
        String person1 = "Bruce Wayne";
        String person2 = "Bruce Wayne";
        String person3 = "Batman";

        // System.out.println("Is person1 equalvalent to person2? " + (person1 == person2));
        // System.out.println("Is person1 equal to person2? " + person1.equals(person2));

        person1 = person3;

        System.out.println("The object person1 is now an alias of person 3, which has a value equal to " + person1);
        System.out.println("Is person1 equalvalent to person3? " + (person1 == person3));
        System.out.println("Is person1 equal to person3? " + person1.equals(person3));

    }
}