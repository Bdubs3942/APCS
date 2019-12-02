public class DecimalCompactor {
    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(4.23d,4.23d));
    }

    public static boolean areEqualByThreeDecimalPlaces(double foo, double bar) {
        int x = (int) (foo * 1000);
        int y = (int) (bar * 1000);
        
        return (x == y);
        
       // return ((int) (foo * 1000) == (int) (bar * 1000));
    }
}