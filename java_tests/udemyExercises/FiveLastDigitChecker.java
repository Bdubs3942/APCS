public class FiveLastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(14, 44, 10000));
    }

    public static boolean hasSameLastDigit(int fDigit, int sDigit, int tDigit) {
        if ((fDigit >= 10 && fDigit <= 1000) && (sDigit >= 10 && sDigit <= 1000) && (tDigit >= 10 && tDigit <= 1000)){
            int fDigitLast = fDigit % 10;
            int sDigitLast = sDigit % 10;
            int tDigitLast = tDigit % 10;

            if ((fDigitLast == sDigitLast) || (fDigitLast == tDigitLast) || (sDigitLast == tDigitLast)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isValid(int rangeNum){
        return (rangeNum >= 10 && rangeNum <= 1000);
    }
}