public class ForLoopThree
{
    public static void main(String[] args)
    {
        String name = "David Sobolewski";

        for(int i = 0; i < name.length(); i++)
        {
            System.out.println(name.substring(i,i+1));
        }
        // String s = "Hello";
        // String sReversed = "";
        // String ithLetter;
   
        // for(int i=0; i < s.length(); i++) {
        //     ithLetter = s.substring(i,i+1);
        //     // add the letter at index i to what's already reversed.
        //     sReversed = ithLetter + sReversed;
        // }
        // System.out.println(s + " reversed is " + sReversed);
    }
}