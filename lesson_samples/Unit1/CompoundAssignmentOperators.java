public class CompoundAssignmentOperators{

    public static void main(String[] args)
    {
        int numOfBears = 175;
        System.out.println("There are " + numOfBears + " bears attacking the beehives.\n");
        numOfBears += 36;
        System.out.println("There are " + numOfBears + " bears attacking the beehives.\n");
        numOfBears -= 11;
        System.out.println("There are " + numOfBears + " bears attacking the beehives.\n");
        numOfBears *= 2;
        System.out.println("There are " + numOfBears + " bears attacking the beehives.\n");
        numOfBears /= 4;
        System.out.println("There are " + numOfBears + " bears attacking the beehives.\n");
        numOfBears %= 100;
        System.out.println("There are " + numOfBears + " bears attacking the beehives.\n");
        System.out.println("The attack has finished. The bears are gone. For now...\n");
    }
}