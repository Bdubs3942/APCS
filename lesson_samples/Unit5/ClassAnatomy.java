public class ClassAnatomy {

    //Since these variables are outside of any method, they are scoped to the class.
    //As a result, they are available across the whole class.

    String classVariableString;
    int classVariableInt;

    //This is a constructor. It is the method used to create a class.
    //Construtors are made by making a method with the same name as a class.
    //Typically, constructors set the inital state of the class variables,
    //as well as execute any required start up functions.
    //I'm employing a common convention here in the constructor.
    //I've set the class variables equal to the parameters as via the constructor.

    public ClassAnatomy(String initClassVariableString, int initClassVariableInt)
    {
        classVariableString = initClassVariableString;
        classVariableInt = initClassVariableInt;
    }

    //Here's main method. Technically, you can declare it anywhere. I like to put it between the
    //constructor and the rest of the methods. Some prefer to have it at the end too.

    public static void main(String[] args)
    {
        //Since the methods of this class are being used in main, we need to make an instance
        //of the class we are currently in to get around static.
        //Yes, it's kind of weird.
        //But think about it. All the methods belong to an object right? Thus, you're just making an
        //instance of the object (yes, the object you're using) to access that method.

        ClassAnatomy ca = new ClassAnatomy("This is a string.", 42);

        //Note, we are calling the method from the instance of the object we used above.

        ca.printClassVariables();
    }

    //This method belongs to this class. As you can see, it's not static, so it's
    //not the same across all classes. These variables are usable in here since they are scoped
    //to the class, not this method.

    public void printClassVariables()
    {
        System.out.println(classVariableString);
        System.out.println(classVariableInt);
    }
}