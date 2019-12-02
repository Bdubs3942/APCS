public class overloadPractice{
    public static void main(String[] args){
        double foo = calcFeetAndInchesToCentimeters(5, 10);
        System.out.println(foo + " inches.");

        double bar = calcFeetAndInchesToCentimeters(60);

        System.out.println(bar);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && (inches >= 0 && inches <=12)){
            return (double)(((feet * 12) + inches) * 2.54);
        } else {
            return -1d;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            return (double)(inches * 2.54);
        } else {
            return -1d;
        }
    }

}