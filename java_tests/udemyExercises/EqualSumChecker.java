public class EqualSumChecker {
    public static void main(String[] args){
        boolean x = hasEqualSum(1, 1, 2);
        System.out.println(x);
    }

    public static boolean hasEqualSum(int firstNum, int secondNum, int thirdNum){
        return ((firstNum + secondNum) == thirdNum);
    }
}