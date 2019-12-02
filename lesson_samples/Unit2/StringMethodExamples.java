public class StringMethodExamples
{
    public static void main(String[] args)
    {
        String foo = "Bear";
        String fooTwo = "Bear";
        String bar = "Ursidae";
        String letter = "a";
        String lettersOne = "qk";
        String lettersTwo = "ar";

        System.out.println("The length of " + foo + " is " + foo.length());
        System.out.println(foo + " in upper case is " + foo.toUpperCase());
        System.out.println(foo + " in lower case is " + foo.toLowerCase());
        System.out.println("Is " + foo + " equal to " + bar + "? " + foo.equals(bar));
        System.out.println("Is " + foo + " equal to " + fooTwo + "? " + foo.equals(fooTwo));
        System.out.println("Is the word " + foo + " the same as the word " + foo.toLowerCase() + "? " + foo.equals(foo.toLowerCase()));
        System.out.println("Is the word " + foo + " the same as the word " + foo.toLowerCase() + "? " + foo.equalsIgnoreCase(foo.toLowerCase()));
        System.out.println("The letter " + letter + " is at index " + foo.indexOf(letter) + " in the word " + foo);
        System.out.println("Does the word " + foo + " contain the letters " + lettersOne + "? " + foo.contains(lettersOne));
        System.out.println("Does the word " + foo + " contain the letters " + lettersTwo + "? " + foo.contains(lettersTwo));
        System.out.println("Is the word " + foo + " the same as the word Bear? " + foo.equals("Bear"));
        System.out.println("Unless I am mistaken, that " + foo + " is eating a " + foo.replace("B", "p"));
        foo = foo.concat("                   ");
        System.out.println("That " + foo + " likes his space.");
        foo = foo.trim();
        System.out.println("Hey " + foo + ", you gotta keep it tight dude.");

        //ADD IN SUBSTRING
    }
}