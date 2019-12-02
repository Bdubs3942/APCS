public class IfElseElseIfStatements
{
    public static void main(String[] args)
    {
        boolean varOne = false;
        int varTwo = 12;
        int varThree = 24;
        String varFour = "dog";
        String varFive = "cat";

        if(varOne)
        {
            System.out.println("The first statement evaluated to true.");
        }
        else if(varTwo > varThree)
        {
            System.out.println("The second statement evaluated to true.");
        }
        else if(varFour.equals(varFive))
        {
            System.out.println("The third statement evaluated to true.");
        }
        else
        {
            System.out.println("This statement triggered the else statement, which means the condition was false.");
        }
    }
}