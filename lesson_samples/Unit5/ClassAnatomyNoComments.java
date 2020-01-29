public class ClassAnatomyNoComments {

    String classVariableString;
    int classVariableInt;
    String x="Foo";

    public ClassAnatomyNoComments(String initClassVariableString, int initClassVariableInt)
    {
        classVariableString = initClassVariableString;
        classVariableInt = initClassVariableInt;
    }

    public static void main(String[] args)
    {
        ClassAnatomyNoComments ca = new ClassAnatomyNoComments("This is a string.", 42);

        ca.printClassVariables();
        
        System.out.println(ca.x);
    }

    public void printClassVariables()
    {
        System.out.println(classVariableString);
        System.out.println(classVariableInt);
    }
}