public class VariableMath
{
    public static void main(String[] args)
    {
        int firstNum = 400;
        int secondNum = 6;
        int thirdNum = 24;

        int sampleAdding = firstNum + secondNum;
        int sampleSubtraction = secondNum - firstNum;
        int sampleMultiplication = thirdNum * firstNum;
        int sampleDivision = thirdNum / secondNum;

        System.out.println(firstNum + " plus " + secondNum + " is " + sampleAdding + ".");
        System.out.println(secondNum + " plus " + firstNum + " is " + sampleSubtraction + ".");
        System.out.println(thirdNum + " plus " + firstNum + " is " + sampleMultiplication + ".");
        System.out.println(thirdNum + " plus " + secondNum + " is " + sampleDivision + ".");
    }
}