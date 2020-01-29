public class AccessorMutatorSample
{
    private String name;
    private String school = "Cretin-Derham Hall";
    private String superSecretGovernmentIssuedID = "b32Qe5Dk9";

    public static void main(String[] args)
    {
    }

    public AccessorMutatorSample(String initName)
    {
        name = initName;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public String getSchool()
    {
        return school;
    }
}