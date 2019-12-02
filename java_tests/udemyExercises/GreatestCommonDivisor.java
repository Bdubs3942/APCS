public class GreatestCommonDivisor{
    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(590, 6));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if(first >= 10 && second >= 10) {
        int greatestCommonDivisorNumber = 0;
        int counter = 0;

        while (counter <= first) {
            for (int i = 2; i <= first; i++) {
                if (first % i == 0 && second % i == 0) {
                    greatestCommonDivisorNumber = i;
                }
            }
            counter++;
        }

        return greatestCommonDivisorNumber;
        } else {
            return -1;
        }
    }
}