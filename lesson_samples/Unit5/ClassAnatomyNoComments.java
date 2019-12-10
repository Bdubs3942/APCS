public class ClassAnatomyNoComments {

    String classVariableString;
    int classVariableInt;

    public ClassAnatomy(String initClassVariableString, int initClassVariableInt)
    {
        classVariableString = initClassVariableString;
        classVariableInt = initClassVariableInt;
    }

    public static void main(String[] args)
    {

        ClassAnatomy ca = new ClassAnatomy("This is a string.", 42);

        ca.printClassVariables();
    }

    public void printClassVariables()
    {
        System.out.println(classVariableString);
        System.out.println(classVariableInt);
    }
}