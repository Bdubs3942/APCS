public class NumberToWords{
    public static void main(String[] args){
      //  numberToWords(4545);

    }

    public static void numberToWords(int num){
        int originalLength = getDigitCount(num);
        int newLength = 0;

        num = reverse(num);
        newLength = getDigitCount(num);

        if (num == 0) {
            System.out.println("Zero");
        }

        while(num != 0) {
            int currentNumber = num % 10;
            num /= 10;
            
            switch(currentNumber) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
        }

        while (originalLength != newLength){
            System.out.println("Zero");
        }
    }

    public static int reverse(int numToReverse) {
        int reversedNumber = 0;

        while (numToReverse != 0) {
            reversedNumber *= 10;
            reversedNumber += (numToReverse % 10);
            numToReverse /= 10;
        }

        return reversedNumber;
    }

    public static int getDigitCount(int numToCount){
        if (numToCount < 0) {
            return -1;
        } else if (numToCount == 0) {
            return 1;
        } else {
            int total = 0;

            while (numToCount != 0) {
                numToCount /= 10;
                total++;
            }

            return total;
        }
    }
}